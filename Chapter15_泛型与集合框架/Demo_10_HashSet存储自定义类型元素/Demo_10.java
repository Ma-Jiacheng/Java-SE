package Chapter15_泛型与集合框架.Demo_10_HashSet存储自定义类型元素;

import java.util.HashSet;

/*
Set集合存储元素唯一的条件：
    存储的元素（String, Integer, ..., Student, Person...），必须重写hashCode方法和equals方法
 */
public class Demo_10 {
    public static void main(String[] args) {
        //创建一个HashSet集合存储Person
        HashSet<Person> hashSet = new HashSet<>();
        //创建Person对象
        Person person1 = new Person("路人甲", 19);
        Person person2 = new Person("路人甲", 21);     //没有重写hashCode方法，hastCode不同，会存储重复元素
        Person person3 = new Person("路人甲", 21);
        //存储至集合
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        //打印hashSet集合
        System.out.println(hashSet);
    }
}
