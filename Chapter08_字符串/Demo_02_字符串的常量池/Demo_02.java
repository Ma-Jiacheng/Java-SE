package Chapter08_字符串.Demo_02_字符串的常量池;

//字符串的常量池

/*
字符串常量池：程序当中直接写上双引号的字符串就在字符串常量池中

对于基本类型来说， == 就是进行数值的比较
对于引用类型来说， == 就是进行地址值的比较
 */

public class Demo_02 {
    public static void main(String[] args) {
        String str1 = "abc";

        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);     //true
        System.out.println(str1 == str3);     //false
        System.out.println(str2 == str3);     //false
    }
}
