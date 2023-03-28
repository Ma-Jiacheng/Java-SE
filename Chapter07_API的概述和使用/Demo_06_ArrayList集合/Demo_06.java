package Chapter07_API的概述和使用.Demo_06_ArrayList集合;

//ArrayList集合概述和基本使用

/*
数组的长度不可以发生改变，但是ArrayList集合的长度是可以改变的

对于ArrayList来说，有一个<E>代表泛型
    泛型：指装在集合当中的所有元素，全部都是统一的什么类型
    注意：泛型只能是引用类型，不能是基本类型

注意事项：
    1.对于ArrayList来说，直接打印得到的不是地址值，而是内容
    2.如果内容为空，得到的是空的中括号 []
 */

import java.util.ArrayList;

public class Demo_06 {
    public static void main(String[] args) {
        //ArrayList创建
        ArrayList<String> list = new ArrayList<>();     //从JDK 1.7+ 开始，右侧<>括号内可以不写内容，但是<>得写
        System.out.println(list);   //结果为 []

        //向集合中添加一些数据，需要使用add方法
        list.add("路人甲");
        System.out.println(list);

        //添加多个数据
        list.add("炮灰乙");
        list.add("流氓丙");
        list.add("土匪丁");
        System.out.println(list);   //会打印所有list内容，以 , 分隔

    }
}
