package LeetCode.Array;

/**
 * @author EugeneLi
 * @date 2020/11/7 18:22
 * @school FZU
 * @use
 */

/**
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 *
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 *
 * 如果是，则返回最大元素的索引，否则返回-1。
 *
 */
public class P747 {
    public int dominantIndex(int[] nums) {

        int index=0;
        int max=-1;
        for(int i=0;i<nums.length;i++){

            if(nums[i]>=max){
                max=nums[i];
                index=i;
            }
        }
        System.out.println("max"+max);
        System.out.println("index"+index);
        boolean flag=true;
        for(int i=0;i<nums.length;i++){

            if(i==index) continue;
            if(max<2*nums[i]){
                flag=false;
                break;
            }
        }

        if(flag) return index;
        else return -1;
    }

    public static void main(String[] args) {
        int a[]={0,0,0,1};
        P747 p=new P747();
        System.out.println(p.dominantIndex(a));

    }
}
