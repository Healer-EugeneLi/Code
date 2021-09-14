package LeetCode.HashMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author EugeneLi
 * @date 2021/1/1 20:30
 * @school FZU
 * @use
 */
public class p1207 {
    public boolean uniqueOccurrences(int[] arr) {

//        Arrays.sort(arr);
//        int map[]=new int[1001];
        HashMap map=new HashMap<Integer,Integer>();

        for(int num:arr){
            int temp= (int) map.getOrDefault(num,0);
            map.put(num,temp+1);
        }

        Collection values = map.values();
        Object[] objects = values.toArray();
        Arrays.sort(objects);
        for(int i=0;i<objects.length-1;i++){
            if(objects[i]==objects[i+1])
                return false;
        }



        return true;

    }

    public boolean func(int arr[]){

        int count[] = new int[2002]; // 统计数字出现的频率
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] + 1000]++;
        }
        boolean fre[] = {false}; // 看相同频率是否重复出现
        for (int i = 0; i <= 2000; i++) {
            if (count[i]>0) {
                if (fre[count[i]] == false) fre[count[i]] = true;
                else return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        int a[]={1,2,2,1,1,3};
        p1207 p1207=new p1207();
        boolean res=p1207.func(a);
        System.out.println(res);
    }
}
