package 集合;

import org.junit.Test;

import java.util.*;

/**
 * @author EugeneLi
 * @date 2020/12/27 21:43
 * @school FZU
 * @use
 */
public class CollectionsTest {

    @Test
    public void test(){

        List list=new ArrayList();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(12);
        list.add(21);
        list.add(-1);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("反转后的结果:"+list);
        System.out.println(list.size());
        List dest=Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());

        Collections.copy(dest,list);
        System.out.println(dest);

        //使list变成线程安全的
        List list1 = Collections.synchronizedList(list);
        System.out.println("线程安全的list:"+list1);
    }
}
