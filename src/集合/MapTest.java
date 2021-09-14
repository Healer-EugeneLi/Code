package 集合;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * @author EugeneLi
 * @date 2020/12/27 15:28
 * @school FZU
 * @use
 */
public class MapTest {

    @Test
    public void test(){

        HashMap hashMap=new HashMap();
        hashMap.put("aa",11);
        hashMap.put("bb",22);
        hashMap.put("cc",33);
        hashMap.put("dd",12);
        System.out.println(hashMap);

        //查询
        Object value=hashMap.get("bb");
        System.out.println("key:bb "+" value:"+value);

        //判断是否存在
        boolean bb = hashMap.containsKey("bb");
        System.out.println("bb是否存在:"+bb);

        boolean b = hashMap.containsValue(33);
        System.out.println("value:33是否存在:"+b);

        Object object=hashMap.remove("aa");//移除 返回value
        System.out.println("移除aa 返回的值为:"+object);
        System.out.println(hashMap);

        boolean aa = hashMap.containsKey("aa");
        System.out.println("key:aa是否存在"+aa);
        //清空
        hashMap.clear();
        System.out.println(hashMap);

        Map temp=new HashMap();
        temp.put("t1",11);
        temp.put("t2",22);
        hashMap.putAll(temp);
        System.out.println("此时的hashMap:"+hashMap);
    }

    @Test
    public void test2(){
        HashMap hashMap=new HashMap();
        hashMap.put("aa",11);
        hashMap.put("bb",22);
        hashMap.put("cc",33);
        hashMap.put("dd",12);
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println(".....");

        Collection values = hashMap.values();
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next());
    }

    @Test
    public void test3(){
        HashMap hashMap=new HashMap();
        hashMap.put("aa",11);
        hashMap.put("bb",22);
        hashMap.put("cc",33);
        hashMap.put("dd",12);
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext())
        {
            Object key = iterator.next();
            Object value = hashMap.get(key);
            System.out.println(key+": "+value);
        }

    }

    //自然排序
    @Test
    public void test4(){

        Map map=new TreeMap();
        Person p1=new Person(10,"abc");
        Person p2=new Person(11,"jian");
        Person p3=new Person(23,"jeas");
        Person p4=new Person(11,"abc");

        map.put(p1,98);
        map.put(p2,99);
        map.put(p3,100);
        map.put(p4,97);

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            Map.Entry entry=(Map.Entry)next;
            System.out.println(entry.getKey()+"...."+entry.getValue());
        }
    }


    //Tree 定制排序
    @Test
    public void test5(){
        Map map=new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof  Person && o2 instanceof Person){
                    Person p1= (Person) o1;
                    Person p2= (Person) o2;
                    return Integer.compare(p1.getAge(),p2.getAge());//按照年龄从小到大排序
                }
                return 0;
            }
        });

        Person p1=new Person(10,"abc");
        Person p2=new Person(11,"jian");
        Person p3=new Person(23,"jeas");
        Person p4=new Person(11,"abc");

        map.put(p1,98);
        map.put(p2,99);
        map.put(p3,100);
        map.put(p4,97);

        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){

            Object object = iterator.next();
            Map.Entry entry= (Map.Entry) object;
            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());


        }
    }

    @Test
    public void test6(){
        Properties properties=new Properties();

        FileInputStream fis=null;

        try {
            fis=new FileInputStream("jdbc.properties");
            properties.load(fis);

            String name=properties.getProperty("name");
            String password=properties.getProperty("password");
            System.out.println("name:"+name+" password:"+password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
