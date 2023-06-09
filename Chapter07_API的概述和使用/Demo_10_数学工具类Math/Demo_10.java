package Chapter07_API的概述和使用.Demo_10_数学工具类Math;

//数学工具类 Math

/*
java.util.Math 是数学工具类，里面提供了大量的静态方法，完成与数学运算相关的工作

常用的方法：
    1. public static double abs(double num)：获取绝对值
    2. public static double ceil(double num)：向上取整
    3. public static double floor(double num)：向下取整
    4. public static long round(double num)：四舍五入

Math.PI 代表近似的圆周率常量
 */

public class Demo_10 {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));

        System.out.println("===================");

        //向上取整（直接向上取整，不是四舍五入）
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));

        System.out.println("===================");

        //向下取整
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(31.0));

        System.out.println("===================");

        //四舍五入
        System.out.println(Math.round(20.4));
        System.out.println(Math.round(10.5));
    }
}
