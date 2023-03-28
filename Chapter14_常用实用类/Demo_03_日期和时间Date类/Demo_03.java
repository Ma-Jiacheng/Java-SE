package Chapter14_常用实用类.Demo_03_日期和时间Date类;

//日期和时间Date类

import java.util.Date;

/*
java.util.Date：表示日期和时间的类，Date表示特定的时间，精确到毫秒
    毫秒：千分之一秒，1000毫秒 = 1秒
    特定的瞬间：一个时间点，一刹那的瞬间

毫秒值的作用：可以对时间和日期进行计算

日期转换为毫秒：
    当前的日期：2023.03.27-xx:xx:xx
    时间原点（0毫秒）：1970.01.01-00：00：00
    就是当前日期与时间原点的差值
 */
public class Demo_03 {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()); //获取当前系统时间到时间原点经历了多少毫秒

        method1();

        method2();

        method3();

    }

    //Date类的空参数构造方法：Date（）获取的就是当前系统的日期时间
    private static void method1(){
        Date date = new Date();
        System.out.println(date);
    }

    //Date类的带参数构造方法：Date（long date）传递毫秒值参数，转换为Date日期
    private static void method2(){
        Date date = new Date(1679909536913L);
        System.out.println(date);
    }

    //Date类的成员方法：Long getTime()：把当前日期转换为毫秒数
    private static void method3(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

}
