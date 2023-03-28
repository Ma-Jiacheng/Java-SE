package Chapter14_常用实用类.Demo_05_日历Calendar类;

//Calendar类

import java.util.Calendar;
import java.util.Date;

/*
java.util.Calendar类：日历类
Calendar类是一个抽象类，里面提供了很多操作日历字段的方法（YEAR/MONTH/DAY_OF_MONTH/HOUR）
Calendar类无法直接创建对象使用，里面有一个静态方法getInstance()，该方法返回了Calendar类的子类对象

Calendar类常用成员方法
     public int get(int field)：返回给定日历字段的值。
     public void set(int field, int value)：将给定的日历字段设置为给定值。
     public abstract void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
     public Date getTime():返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象
 */
public class Demo_05 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }

    //public int get(int field)：返回给定日历字段的值。
    public static void method1(){
        Calendar calendar = Calendar.getInstance();     //使用静态方法getInstance()，返回了Calendar类的子类对象

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);      //西方月份日期为0~11，中国月份日期为1~12

        int day = calendar.get(Calendar.DATE);
        System.out.println(day);
//        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);       //功能与DATE相同
//        System.out.println(dayOfMonth);
    }

    //public void set(int field, int value)：将给定的日历字段设置为给定值。
    public static void method2(){
        Calendar calendar = Calendar.getInstance();
        //将年字段设置为9999
        calendar.set(Calendar.YEAR, 9999);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        //Month与Date方法同Year，只需要改变字段
    }

    //public abstract void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
    public static void method3(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
    }

    //public Date getTime():返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象
    public static void method4(){
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);
    }

}
