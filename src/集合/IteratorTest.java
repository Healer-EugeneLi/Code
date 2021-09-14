package 集合;

import org.junit.Test;

import java.util.*;

/**
 * @author EugeneLi
 * @date 2020/12/25 18:28
 * @school FZU
 * @use
 */
public class IteratorTest {

    private Collection collection;


    public void func(){
        collection=new ArrayList();
        collection.add(123);
        collection.add("asd");
        // 元素类型 局部变量: 集合 内部仍然是使用迭代器
        for(Object obj:collection){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        Collection coll=new ArrayList();
        coll.add(123);
        coll.add("abc");
        coll.add(new Date());
        coll.add(new Person(12,"jian"));

        Iterator iterator = coll.iterator();
        //hasNext():判断是否还有下一个元素
        while (iterator.hasNext()){
            //next():①指针下移 ②将下移以后集合位置上的元素返回
//            System.out.println(iterator.next());
            Object object=iterator.next();
            if("abc".equals(object)){
                iterator.remove();//移除abc
            }
        }

        iterator=coll.iterator();//需要重新获取迭代器
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        IteratorTest test=new IteratorTest();
        test.func();
        System.out.println("......");
        for(Object obj:coll){
            System.out.println(obj);
        }

        //使用 foreach 遍历的数组，重新赋值不会影响原数组的值
        String[] strings=new String[]{"mm","mm","mm"};
        for(String s:strings)
            s="gg";
        for (String s:strings)
            System.out.println(s);//输出还是mm


    }


}
