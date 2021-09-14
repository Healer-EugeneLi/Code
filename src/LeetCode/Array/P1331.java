package LeetCode.Array;

/**
 * @author EugeneLi
 * @date 2020/11/7 15:36
 * @school FZU
 * @use
 *
 */

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给你一个整数数组 arr ，请你将数组中的每个元素替换为它们排序后的序号。
 *
 * 序号代表了一个元素有多大。序号编号的规则如下：
 *
 * 序号从 1 开始编号。
 * 一个元素越大，那么序号越大。如果两个元素相等，那么它们的序号相同。
 * 每个数字的序号都应该尽可能地小。
 */
public class P1331 {
    public int[] arrayRankTransform(int[] arr) {

        int temp[]=new int[arr.length];
        temp=arr.clone();//复制数组
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(temp);
        int index=1;

        for(int i=0;i<arr.length;i++){

            if(i==0){
                map.put(temp[0],index);
            }
            if(i>0&&temp[i]!=temp[i-1]){
                //如果前后两个数不一样 那肯定是要加1 相同的话 大小值是一样的
                index++;
                map.put(temp[i],index);
            }

        }

        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }

        return arr;
    }
}
