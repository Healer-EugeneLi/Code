package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author EugeneLi
 * @date 2020/10/28 12:33
 * @school FZU
 * @use
 *
 * 写一个栈 包含返回栈中最小值
 */
public class StackGetMin {

    private Stack<Integer> data;
    private Stack<Integer> min;


    public StackGetMin() {
        data=new Stack<Integer>();
        min=new Stack<Integer>();
    }


    public void push(int num){

        data.push(num);
        if(min.isEmpty()){
            min.push(num);
        }else if(num<=min.peek()){
            min.push(num);
        }

    }

    public int pop(){


        if(data.peek()==min.peek()){
            min.pop();//弹栈的时候若数据栈中的数据<=min栈的栈顶 则同样的要把min栈中的数据弹出
        }
        return data.pop();

    }

    public int top(){
        return data.peek();
    }

    public int getMin(){
        return min.peek();

    }



    public static void main(String[] args) {

        StackGetMin stackGetMin=new StackGetMin();

        for(int i=1;i<=4;i++){
            stackGetMin.push(i);
        }

        System.out.println("当前栈顶数据:"+stackGetMin.top());
        System.out.println("当前栈的min值是:"+stackGetMin.getMin());
        System.out.println("压入一个元素0:");
        stackGetMin.push(0);
        System.out.println("当前栈的min值是:"+stackGetMin.getMin());
        System.out.println("弹出当前栈顶元素"+stackGetMin.pop());
        System.out.println("弹出栈顶后 当前栈顶的元素是"+stackGetMin.top());
        System.out.println("弹出当前栈顶元素"+stackGetMin.pop());
        System.out.println("弹出栈顶后 当前栈顶的元素是"+stackGetMin.top());


    }

}
