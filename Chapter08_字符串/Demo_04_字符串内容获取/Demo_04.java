package Chapter08_字符串.Demo_04_字符串内容获取;

//字符串常用方法 —— 内容获取

/*
String中与字符串获取相关的方法有：
    1. public int length()：获取字符串中含有的字符个数，即字符串长度
    2. public String concat(String str)：将当前字符串和参数字符串拼接成为新的字符串
    3. public char charAt(int index)：获取指定索引位置的单个字符（索引从0开始）
    4. public int indexOf(String str)：查找参数字符串在本字符串中首次出现的位置，如果没有返回 -1 值
 */

public class Demo_04 {
    public static void main(String[] args) {
        //获取字符串长度
        int length = "ashdgaskncaucghuqbdg".length();
        System.out.println("字符串的长度是：" + length);

        System.out.println("===================");

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3);   //HelloWorld

        System.out.println("===================");

        //获取指定位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在 1 号索引位置的字符是：" + ch);

        System.out.println("====================");

        //查找参数字符串在目标字符串第一次出现的位置
        String strA = "HelloWorld";
        int index = strA.indexOf("llo");
        System.out.println("第一次出现位置的索引值是：" + index);
    }
}
