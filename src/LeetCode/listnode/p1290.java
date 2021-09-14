package LeetCode.listnode;

import java.util.Stack;

/**
 * @author EugeneLi
 * @date 2021/9/14 10:02
 * @school FZU
 * @use
 */


public class p1290 {

//    public int getDecimalValue(ListNode head) {
//
//        int res=0;
//        //1.根据逆推法 计算回去
//        while (head!=null){
//            res=res*2+ head.val;
//            head=head.next;
//        }
//        return res;
//
//    }


    public int getDecimalValue(ListNode head) {

       //利用栈先进后出的特点 遍历链表的数据 将数据压入栈 再进行弹出栈的操作 将数据按照正常计算的逻辑进行计算

        Stack<Integer> stack=new Stack<>();

        while (head!=null){
            stack.push(head.val);
            head=head.next;
        }

        int res=0;
        int n=0;
        while (!stack.isEmpty()){

            res+=stack.peek()*Math.pow(2,n++);
            stack.pop();
        }
        return res;

    }
}
