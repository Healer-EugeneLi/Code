package 集合;

import org.junit.Test;

import java.util.*;

/**
 * @author EugeneLi
 * @date 2020/12/25 20:53
 * @school FZU
 * @use
 */
public class ListTest {

    @Test
    public void test1(){

        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add("jian");
        list.add(new Person(12,"k"));

        System.out.println(list.size());//4
        System.out.println(list);

        list.add(1,"insert");
        System.out.println(list.size());//5
        System.out.println(list);


        List temp= Arrays.asList(789,999);
        list.addAll(temp);
        System.out.println(list.size());//7
        System.out.println(list);


        //获取指定元素
        System.out.println(list.get(0));//获取索引为0的元素 也就是123
    }

    @Test
    public void test2(){

        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add("jian");
        list.add(new Person(12,"k"));
        list.add(123);
        System.out.println(list);
        //int indexOf(Object obj):返回obj在集合中首次出现的位置。如果不存在，返回-1.
        int firstIndex = list.indexOf(123);
        System.out.println("123首次出现的索引:"+firstIndex);
        //int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置。如果不存在，返回-1
        int lastIndex=list.lastIndexOf(123);
        System.out.println("123最后一次出现的索引:"+lastIndex);


        //Object remove(int index):移除指定index位置的元素，并返回此元素
        Object obj=list.remove(0);
        System.out.println("index==0 obj:"+obj);
        System.out.println(list);

        list.set(0,12333);
        System.out.println(list);

        //List subList(int fromIndex, int toIndex):
        // 返回从fromIndex到toIndex位置的左闭右开区间的子集合
        List subList=list.subList(1,3);//也就是得到索引为1 2的元素构成一个子列表
        System.out.println(subList);
    }

    @Test
    public void test3(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add("jian");

        System.out.println("使用迭代器遍历:");
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("使用增加for循环foreach遍历:");
        for (Object object:list)
            System.out.println(object);

        System.out.println("普通遍历:");
        for (int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }

    @Test
    public void test4(){

        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);

    }

    public void updateList(List list){
        //list.remove(2);//删除的是索引为2的元素
        list.remove(new Integer(2));//删除元素2
    }


    @Test
    public void test5(){

        Set set=new HashSet<>();
        set.add(123);
        set.add(456);
        set.add("aa");
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
