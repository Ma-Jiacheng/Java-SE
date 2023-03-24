package Chapter07_API的概述和使用;

//ArrayList常用方法

/*
ArrayList当中的常用方法有：
    1. public boolean add(E e);     向集合中添加一些元素，参数的类型和泛型一致
        注意：对于ArrayList来说，add添加动作一定是成功的，所以返回值可用可不用
    2. public E get(int index);     从集合中获取元素，参数是索引编号，返回值对应元素的位置
    3. public E remove(int index);      从集合当中删除元素，参数是索引编号，返回值是被删除掉的元素
    4. public int size();       获取集合的长度，返回值是集合当中包含的元素个数
 */

import java.util.ArrayList;

public class Demo_07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //向集合中添加元素：add
//        boolean success = list.add("路人甲");
//        System.out.println("添加是否成功：" + success);
        list.add("路人甲");
        list.add("炮灰乙");
        list.add("流氓丙");
        list.add("土匪丁");
        System.out.println("当前列表内容" + list);

        System.out.println("----------------------");

        //获取集合中的元素
        String name = list.get(3);
        System.out.println("3号索引内容：" + name);

        System.out.println("----------------------");

        //从集合中删除元素
        String whoRemoved = list.remove(2);
        System.out.println("被删除的人是：" + whoRemoved);
        System.out.println(list);

        System.out.println("----------------------");

        //获取集合长度(元素个数)
        int size = list.size();
        System.out.println("集合的长度是：" + size);

        System.out.println("----------------------");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名：" + list.get(i));
        }

    }
}
