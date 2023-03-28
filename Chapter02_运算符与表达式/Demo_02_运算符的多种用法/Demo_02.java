package Chapter02_运算符与表达式.Demo_02_运算符的多种用法;

//运算符的多种用法

/*
四则运算中 “+” 号的多种用法：
    1.对于数值来讲，就是普通加法
    2.对于char字符类型来讲，在计算之前，char会被升级为int，然后再进行计算（char和int之间的计算关系对照关系表ASCII、Unicode）
    3.对于字符串String（首字母大写，并不是关键字）来说， “+” 号代表字符串连接操作，任何数据类型和字符串进行连接操作，都会变成字符串类型
 */
public class Demo_02 {
    public static void main(String[] args) {
        //字符串变量的基本使用
        //数据类型 变量名称 = 数据值
        String str1 = "Hello";
        System.out.println(str1);   //Hello
        System.out.println("Hello" + "World");  //HelloWorld

        //String + int -->String
        String str2 = "Java";
        System.out.println(str2 + 20);  //Java20
        //优先级问题
        System.out.println(str2 + 20 + 30);  //Java2030
        System.out.println(str2 + (20 + 30));   //Java50
    }
}
