package Chapter16_Map集合概述.Demo_04_自定义类型键值;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap存储自定义类型键值：
    Map集合保证key唯一：作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
    key：使用String类型，String类型重写了hashCode方法和equals方法，可以保证key唯一
    value：使用Person类型，value可以重复
 */
public class Demo_04 {
    public static void main(String[] args) {
        methodValue();

        System.out.println("================");

        methodKey();
    }

    //使用自定义类型value
    private static void methodValue(){
        //创建Map对象
        Map<String, Person> map = new HashMap<>();
        //添加元素
        map.put("一号元素", new Person("张三", 18));
        map.put("二号元素", new Person("李四", 20));
        map.put("三号元素", new Person("王五", 23));
        //获取key的Set集合
        Set<String> set = map.keySet();
        //通过Set集合遍历Map集合
        for (String s : set) {
            System.out.println("编号：" + s +  " 对象：" + map.get(s));
        }
    }

    //使用自定义类型key
    private static void methodKey(){
        //创建Map对象
        Map<Person, String> map = new HashMap<>();
        //添加元素
        map.put(new Person("张三", 10), "小学生");
        map.put(new Person("李四", 17), "中学生");
        map.put(new Person("王五", 23), "大学生");
        map.put(new Person("王五", 23), "研究生");
        //获取key的Set集合
        Set<Person> set = map.keySet();
        //通过Set集合遍历Map集合
        for (Person p : set) {
            System.out.println("对象：" + p +  " 学历：" + map.get(p));
        }
    }

}
