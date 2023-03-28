package Chapter07_API的概述和使用.Demo_09_数组工具类Arrays;

//数组工具类Arrays

import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组常见的操作

常用的方法：
    1. public static String toString(数组参数)：将参数传入的数组变为字符串（按照默认格式：[元素1， 元素2， 元素3...]）
    2. public static void sort(数组参数)：按照默认升序（从小到大）对数组元素进行排序
 */
public class Demo_09 {
    public static void main(String[] args) {
        //将数组按照默认格式转变为字符串
        int[] intArray = {10, 20, 30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        //按照默认升序对数组进行排序
        int[] array = {1, 4, 2, 7, 5, 0};
    }
}
