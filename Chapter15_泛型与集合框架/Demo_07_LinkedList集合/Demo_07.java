package Chapter15_泛型与集合框架.Demo_07_LinkedList集合;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedList;

/*
LinkedList集合的特点：
    1.拥有List接口的所有特点
    2.底层是一个链表结构：查询慢、增删快
    3.包含大量操作首尾元素的方法
注意：使用LinkedList集合特有方法，不能使用多态
 */
public class Demo_07 {
    public static void main(String[] args) {

        //创建LinkedList集合对象
        LinkedList<String> linkedList = new LinkedList<>();

        //向集合中添加元素
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        System.out.println(linkedList);

        //void addFirst(E e)：向集合开头添加元素
        linkedList.addFirst("Head");
        System.out.println(linkedList);

        //void addLast(E e)：向集合末尾添加元素
        linkedList.addLast("Tail");
        System.out.println(linkedList);

        //boolean isEmpty()：判断集合是否非空
        //E getFirst()：返回集合第一个元素
        //E getLast()：返回集合最后一个元素

        if (!linkedList.isEmpty()) {
            String s1 = linkedList.getFirst();
            String s2 = linkedList.getLast();
            System.out.println("第一个元素：" + s1);
            System.out.println("最后一个元素：" + s2);
        }

        //E removeFirst()：移除并返回集合中的第一个元素
        //E removeFirst()：移除并返回集合中的最后一个元素
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

    }
}
