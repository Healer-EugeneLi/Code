package LeetCode.HashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author EugeneLi
 * @date 2020/12/31 11:59
 * @school FZU
 * @use
 */
public class P1002 {
    public List<String> commonChars(String[] A) {

        List<String> list=new ArrayList<>();

        int res[]=new int[26];
        //先统计第一个字符串中字符的次数
        for(char c:A[0].toCharArray())
            res[c-'a']++;

        //统计其他字符串
        for(int i=1;i<A.length;i++){

            int temp[]=new int[26];
            for(char c:A[i].toCharArray())
                temp[c-'a']++;
            for(int j=0;j<26;j++){

                res[j]=Math.min(res[j],temp[j]);//更新最小字符出现次数
            }

        }

        for(int i=0;i<res.length;i++){
            if(res[i]>0){
                for(int j=0;j<res[i];j++){

                    list.add((char)(i+'a')+"");
                }
            }
        }

        return list;

    }
}
