package Chapter15_泛型与集合框架.Demo_01_Collection集合常用方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/*
Collection集合是所有单列集合的父接口，其中定义了单列集合（List和Set）通用的一些方法，具体如下：
    - boolean add(E e)：把给定的对象添加到当前集合中
    - void clear()：清空集合中所有的元素
    - boolean remove(E e)：把给定的对象在当前集合中删除
    - boolean contains(E e)：判断当前集合中是否包含给定的对象
    - boolean isEmpty()：判断当前集合是否为空
    - int size()：返回集合中元素的个数
    - Object[] toArray()：把集合中的元素存储到数组中
 */
public class Demo_01 {
    public static void main(String[] args) {

        //创建集合对象，可以使用多态
//        Collection<String> collection = new ArrayList<>();
        //Collection中的方法是所有集合通用的，将ArrayList集合改为HashSet集合仍然可用
        Collection<String> collection = new HashSet<>();
        System.out.println(collection);     //集合为空

        System.out.println("=================");

        //boolean add(E e)：把给定的对象添加到当前集合中
        boolean bool1 = collection.add("张三");    //返回值的boolean值通常都为true，没有特殊要求一般不用接收
        collection.add("李四");
        collection.add("王五");
        collection.add("赵六");
        System.out.println("是否添加成功：" + bool1);
        System.out.println(collection);     //[张三, 李四, 王五],添加元素成功

        System.out.println("==================");

        //boolean remove(E e)：把给定的对象在当前集合中删除
        boolean bool2 =  collection.remove("赵六");   //如果集合中存在该元素，删除元素，返回true
        boolean bool3 = collection.remove("田七");    //如果集合中不存在该元素，删除失败，返回false
        System.out.println("删除是否成功：" + bool2);
        System.out.println("删除是否成功：" + bool3);
        System.out.println(collection);

        System.out.println("==================");

        //boolean contains(E e)：判断当前集合中是否包含给定的对象
        boolean bool4 = collection.contains("张三");  //如果集合中包含该元素，返回true
        boolean bool5 = collection.contains("张四");  //如果集合中不包该元素，返回false
        System.out.println("是否包含该对象：" + bool4);
        System.out.println("是否包含该对象：" + bool5);

        System.out.println("===================");

        //int size()：返回集合中元素的个数
        System.out.println(collection);
        int num = collection.size();
        System.out.println("当前集合共有：" + num + "个元素");

        System.out.println("===================");

        //Object[] toArray()：把集合中的元素存储到数组中
        String[] name = new String[3];
        collection.toArray(name);   //将集合中的元素存储到数组当中
        System.out.println(Arrays.toString(name));

        System.out.println("====================");

        //boolean isEmpty()：判断当前集合是否为空
        //void clear()：清空集合中所有的元素
        boolean bool6 = collection.isEmpty();   //判断集合是否为空，如果是返回true，不是返回false
        System.out.println("当前集合是否为空：" + bool6);
        collection.clear();     //清空集合
        boolean bool7 = collection.isEmpty();
        System.out.println("当前集合是否为空：" + bool7);
    }
}
