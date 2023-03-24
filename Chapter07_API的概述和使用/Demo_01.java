package Chapter07_API的概述和使用;

//Scanner类

/*
Scanner类：一个可以解析基本类型和字符串的简单文本扫描器，可以实现键盘输入数据到程序当中

引用类型的一般使用步骤：
    1.导包：import 包路径.类名称，只有java.lang包下的内容不需要导包
    2.创建：类名称 对象名 = new 类名称()
    3.使用：对象名.成员方法名（参数）
 */

// 1.导包————写在package语句之后，public class之前

import java.util.Scanner;

public class Demo_01 {
    public static void main(String[] args) {
        // 2.创建
        Scanner sc = new Scanner(System.in);    //System.in 代表从键盘进行输入

        //3.使用
        //获取键盘输入的数字
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);

        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
