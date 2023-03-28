package Chapter08_字符串.Demo_01_字符串的概念;

//字符串的概念和特点
//字符串的构造方法和直接创建

/*
Java.lang.String类代表字符串

Java程序中所有字符串字面值都作为此类的实现，程序中所有带 “” 号的字符串都是String类的对象

字符串的特点：
    1.字符串的内容不可变
    2.因为字符串内容不可改变，所以字符串内容是可以共享使用的
    3.字符串效果上相当于是 char[] 数组，但底层原理是 byte[] 字节数组

创建字符串的常见方式：
    1. public String();     创建一个空白字符串
    2. public String(char []array);    根据字符数组内容，来创建对应字符串
    3. public String(byte[] array);    根据字节数组内容，来创建对应字符串
    4.String str = "Hello"    直接创建
注意：不论是否使用 new 关键字，使用双引号就是 String 的对象
 */

public class Demo_01 {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串：" + str1);

        //根据字符数组创建字符串
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

        //根据字节数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);

        //直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串：" + str4);
    }
}
