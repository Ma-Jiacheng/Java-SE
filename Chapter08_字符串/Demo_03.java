package Chapter08_字符串;

//字符串常用方法 —— 内容比较

/*
程序中 == 是进行对象的地址值比较，如果需要内容比较，可以使用两个方法：
    1. public boolean equals(Object obj)：参数可以是任何对象
    2. public boolean equalsIgnoreCase(String str)：忽略大小写进行内容比较
注意事项：
    1.任何对象都能使用Object进行接收
    2.equals方法具有对称性，也就是 a.equals(b) 和 b.equals(a) 是一样的
    3.如果比较双方一个变量一个常量，推荐将常量字符串写在前面
    4.equalsIgnoreCase只区分英文字母大小写
 */

public class Demo_03 {
    public static void main(String[] args) {
        //equals方法进行字符串内容比较
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str4 = new String(charArray);

        System.out.println(str1.equals(str4));  //true
        System.out.println(str2.equals(str3));  //false
        System.out.println(str4.equals("Hello"));   //true
        System.out.println("Hello".equals(str1));   //true

        System.out.println("==========================");

        //equalsIgnoreCase 方法进行字符串内容比较
        String strA = "JAVA";
        String strB = "java";
        System.out.println(strA.equals(strB));    //false，区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));    //true，忽略大小写
    }
}
