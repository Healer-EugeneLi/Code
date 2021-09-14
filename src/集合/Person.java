package 集合;

import java.util.Objects;

/**
 * @author EugeneLi
 * @date 2020/12/25 17:17
 * @school FZU
 * @use
 */
public class Person implements Comparable {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, name);
    }

    //按照姓名从小到大排列,年龄从小到大排列
    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person= (Person) o;
            int compare = this.name.compareTo(person.name);
            if(compare!=0)
                return compare;
            else
                return Integer.compare(this.age,person.age);
        }else
            throw new RuntimeException("输入类型不匹配");

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
