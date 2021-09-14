package StackAndQueue;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author EugeneLi
 * @date 2020/10/29 0:01
 * @school FZU
 * @use
 */
public class MaxWindow {


    public static int[] getMaxWindow(int[]arr,int w){

        if(arr==null||arr.length<w||w<1) return null;

        LinkedList<Integer> qmax=new LinkedList<Integer>();

        int res[]=new int[arr.length-w+1];

        int index=0;
        for(int i=0;i<arr.length;i++){

            //窗口右边扩大逻辑
            while (!qmax.isEmpty()&&arr[qmax.peekLast()]<=arr[i]){
                qmax.pollLast();//弹出qmax的尾部
            }
            qmax.addLast(i);//将下标加进来

            //窗口左边删除数
            if(qmax.peekFirst()==i-w){
                //过期
                qmax.pollFirst();//弹出过期的下标
            }

            if(i>=w-1){
                res[index++]=arr[qmax.peekFirst()];
            }
        }

        return res;

    }

    public static void main(String[] args) {

        int[] arr={4,3,5,4,3,3,6,7};
        int w=3;
        int[] res;
        res=MaxWindow.getMaxWindow(arr,w);
        System.out.println(Arrays.toString(res));


    }
}
