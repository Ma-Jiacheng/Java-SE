package Chapter14_常用实用类.Demo_07_08_StringBuilder类;

/*
String类：
    字符串是常量，它们的值在创建之后不能更改。
    private final byte[] value，字符串底层是一个被final修饰的数组，一旦被赋值就不能再改变，是一个常量
    进行字符串的相加，内存中就会有多个字符串，占用空间多，效率低
    例：计算 "a"+b"+"c"
        初始值：String str = "a"+"b"+"c"——1个数组
        中间结果：String str = "ab"——1个数组
        结果：String str = "abc"——1个数组

StringBuilder类：
    也叫字符串缓冲区，可以提高字符串的操作效率（看成一个长度可以变化的字符串）
    底层也是一个数组，但是没有被final修饰
    StringBuilder在内存中始终是一个数组，占用空间少，效率高
    如果超出了StringBuilder的容量，会自动扩容
    例：计算 "a"+"b"+"c"
        初始值：String str = "a"+"b"+"c"——1个数组
        中间结果：String str = "ab"——在同一个数组
        结果：String str = "abc"——还在同一数组

StringBuilder类构造方法：
    1.StringBuilder()：构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
    2.StringBuilder(String str)：构造一个字符串生成器，并初始化为指定的字符串内容。

StringBuilder类成员方法：
    1.StringBuilder append(......)：添加任意类型数据的字符串形式，返回当前对象自身
    2.String toString()：将当前StringBuilder对象转换为String对象。
 */
public class Demo_07 {
    public static void main(String[] args) {
        //StringBuilder空参数构造的方法
        StringBuilder strB1 = new StringBuilder();
        System.out.println(strB1);

        //StringBuilder带参数的构造方法
        StringBuilder strB2 = new StringBuilder("Mjc");
        System.out.println(strB2);

        //StringBuilder append(......)：添加任意类型数据的字符串形式，返回当前对象自身
        //append()返回的是this，即调用方法的对象，所以无需进行接收
        StringBuilder strB3 = new StringBuilder();
        strB3.append("abc");
        System.out.println(strB3);
        //链式编程：方法的返回值是一个对象时，可以根据对象继续调用方法
        System.out.println("a".toUpperCase().toLowerCase().toUpperCase());
        strB3.append("d").append("e").append("f").append("g");
        System.out.println(strB3);
    }
}
