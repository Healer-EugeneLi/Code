package StackAndQueue;

import java.util.Stack;

/**
 * @author EugeneLi
 * @date 2020/10/28 12:35
 * @school FZU
 * @use
 *
 * 使用递归函数来翻转栈
 */
public class ReverseStackUseRecursion {


    public static int getAndRemoveLastEment(Stack<Integer> stack){

        int result=stack.pop();//先弹出一个元素
        if(stack.isEmpty()){
            //如果此时栈为空 则说明弹出的元素就是最后一个了
            return result;
        }else {
            //继续递归
            int last=getAndRemoveLastEment(stack);//最终返回的last就是栈低的元素
            stack.push(result);//把临时踏出来的元素压回去
            return last;//返回栈低元素
        }
    }

    public static void reverse(Stack<Integer> stack){

        if(stack.isEmpty()){
            return;
        }else {

            int i=getAndRemoveLastEment(stack);//获得当前栈低元素 并移除
            reverse(stack);//继续递归
            stack.push(i);//递归返回的时候压入栈
        }

    }

    public static void main(String[] args) {
        Stack<Integer> test=new Stack<Integer>();
        test.push(1);
        test.push(2);
        test.push(3);

        ReverseStackUseRecursion.reverse(test);
        while (!test.isEmpty()){
            System.out.println(test.pop());
        }

    }
}
