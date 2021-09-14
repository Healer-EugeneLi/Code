package 集合;

import org.junit.Test;

import java.util.*;

/**
 * @author EugeneLi
 * @date 2020/12/25 16:30
 * @school FZU
 * @use
 */
public class CollectionTest {



    public static void main(String[] args) {

        Collection collection=new ArrayList<>();

        collection.add(1);
        collection.add("abc");
        collection.add(new Date());

        System.out.println(collection.size());
        System.out.println(collection);

        Collection coll=new ArrayList();
        coll.add(23);
        coll.add("jnk");

        //注意这边是使用addAll也就是将集合coll中的全部元素放进collection
        //如果是使用add(coll) 那会将coll中的数据当做一个对象添加进去
        collection.addAll(coll);
        System.out.println(collection.size());
        System.out.println(collection);

        System.out.println(collection.isEmpty());//判断集合是否为空

        //contains是通过equals的方法来比较的 如果是自己创建的对象的话 一般要求重写equals方法
        System.out.println("是否包含1:"+collection.contains(1));

        collection.add(new Person(13,"jian"));

        System.out.println("是否包含person:"+collection.contains(new Person(13,"jian")));


        System.out.println("hash码"+collection.hashCode());

        //集合转为数组
        System.out.println("集合转为数组");
        Object[] objects = collection.toArray();
        for(int i=0;i<objects.length;i++)
            System.out.println(objects[i]);

        //数组转为集合
        System.out.println("数组转为集合");
        List<String> list = Arrays.asList(new String[]{"aa", "bb", "cc"});
        System.out.println(list);

        List arr1=Arrays.asList(new int[]{1,2});
        System.out.println("arr1:"+arr1);

        List arr2=Arrays.asList(new Integer[]{1,2});
        System.out.println(arr2);

    }

    //TreeSet自然排序测试
    @Test
    public void test6(){
        Set set=new TreeSet();
        set.add(new Person(12,"jian"));
        set.add(new Person(23,"jkl"));
        set.add(new Person(34,"lous"));
        set.add(new Person(14,"oo"));
        set.add(new Person(23,"jinagege"));
        set.add(new Person(22,"jinagege"));

        Iterator iterator = set.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    //TreeSet 定制排序测试 按照年龄从小到大排序
    @Test
    public void test7(){
        Comparator comparator=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1= (Person) o1;
                    Person p2= (Person) o2;
                    return Integer.compare(p1.getAge(),p2.getAge());
                }else
                    throw new RuntimeException("运行时类型不匹配");

            }
        };

        Set set=new TreeSet();
        set.add(new Person(12,"jian"));
        set.add(new Person(23,"jkl"));
        set.add(new Person(34,"lous"));
        set.add(new Person(14,"oo"));
        set.add(new Person(23,"jinagege"));
        set.add(new Person(22,"jinagege"));

        Iterator iterator = set.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }

    //在list中去掉重复的数字 借助set
    @Test
    public void test8(){

        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add("ddd");
        list.add(new Integer(4));

        System.out.println("使用set之前...");
        System.out.println(list);
        Set set=new HashSet();
        set.addAll(list);
        list=new ArrayList(set);
        System.out.println("使用set之后...");
        System.out.println(list);

    }

    @Test
    public void test9(){
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");

        set.add(p1);
        set.add(p2);
        System.out.println(set);//[Person{age=1002, name='BB'}, Person{age=1001, name='AA'}]

        //情况1：由于修改了 p1 对象的属性值，此时remove方法进行 hashCode 时得到的值不一致，
        // 所以成功写入该Set集合
        p1.setName("CC");
        set.remove(p1);
        System.out.println(set);//[Person{age=1002, name='BB'}, Person{age=1001, name='CC'}]

        //情况2：通过 hashCode 计算属性值为 id=1001, name='AA' 的对象得到的索引位置，
        // 该位置上的没有储存任何的值（虽然修将p1的name修改为了 “CC” ，但是他的索引位置没变）所以成功写入。
        set.add(new Person(1001,"CC"));
        System.out.println(set);//[Person{age=1002, name='BB'}, Person{age=1001, name='CC'}, Person{age=1001, name='CC'}]

        //情况3：通过 hashCode 得到的 new Person(1001,"AA") 与 p1 的值相同，但此时的 p1 对象的name为 “CC”，
        // 所以与p1进行 equals() 得到的结果为 false，所以写入成功。
        set.add(new Person(1001,"AA"));
        System.out.println(set);//[Person{age=1002, name='BB'}, Person{age=1001, name='CC'}, Person{age=1001, name='CC'}, Person{age=1001, name='AA'}]
    }
}
