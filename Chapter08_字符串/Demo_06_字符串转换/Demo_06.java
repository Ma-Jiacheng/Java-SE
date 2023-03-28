package Chapter08_字符串.Demo_06_字符串转换;

//字符串常用方法——字符串转换

/*
String中与字符串转换相关的方法：
    1. public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值
    2. public byte[] getBytes：获得当前字符串底层的字节数组
    3. public String replace(CharSequence oldString, CharSequence newString)：将出现的所有老字符串替换为新字符串
 */

public class Demo_06 {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);   //字符数组第一个字符 H
        System.out.println(chars.length);   //字符数组长度 5

        System.out.println("======================");

        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        System.out.println("======================");

        //字符串内容替换
        String str1 = "How do you do ?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);
    }
}
