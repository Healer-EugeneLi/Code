package StackAndQueue;

import java.util.Stack;

/**
 * @author EugeneLi
 * @date 2020/10/28 18:34
 * @school FZU
 * @use
 *
 * 使用一个栈来排序另外一个栈
 * 使得栈从栈顶到栈底元素从大到小排序
 */
public class StackSort {

    public static void sortStackByStack(Stack<Integer> stack){

        Stack<Integer> help=new Stack<Integer>();

        while(!stack.isEmpty()){

            int cur=stack.pop();
            while (!help.isEmpty()&&cur>help.peek()){
                //当help栈不为空 且cur比当前help栈的元素要大
                stack.push(help.pop());
            }
            help.push(cur);//到合适的位置将cur压入help栈中国
        }

        while(!help.isEmpty()){
            stack.push(help.pop());
        }

    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(3);

        StackSort.sortStackByStack(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
