package Chapter15_泛型与集合框架.Demo_06_List集合介绍与常用方法;

import java.util.ArrayList;
import java.util.List;

/*
list接口的特点：
    1.有序的集合，存储元素和取出元素的顺序是一致的
    2.有索引，包括一些带索引的方法
    3.允许存储重复的元素

list接口常用方法：
    void add(int index, E element)：在列表的指定位置插入指定元素
    E get(int index)：返回列表中指定位置的元素
    E remove(int index)：移除列表中指定位置的元素
    E set(int index, E element)：用指定元素替换列表中指定位置的元素
 */
public class Demo_06 {
    public static void main(String[] args) {

        //创建一个List集合对象
        List<String> list = new ArrayList<>();

        //向集合中添加元素
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");

        //输出List集合
        System.out.println(list);

        //void add(int index, E element)：在列表的指定位置插入指定元素
        list.add(2,"E");
        System.out.println(list);

        //E remove(int index)：移除列表中指定位置的元素
        list.remove(3);
        System.out.println(list);

        //E set(int index, E element)：用指定元素替换列表中指定位置的元素
        list.set(2,"C");
        list.set(4,"E");
        System.out.println(list);

        //E get(int index)：返回列表中指定位置的元素
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
