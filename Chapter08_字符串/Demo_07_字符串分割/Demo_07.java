package Chapter08_字符串.Demo_07_字符串分割;

//字符串常用方法——字符串的分割

/*
分割字符串的方法：
    1. public String split(String regex)：按照参数的规则，将字符串分割为若干部分

注意事项：
    split 方法的参数实际上是一个正则表达式，如果需要按照 “.” 进行切割，必须写为 “\\.”
 */

public class Demo_07 {
    public static void main(String[] args) {
        //字符串按 ”,“ 分割
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("======================");

        //字符串按 “ ” 分割
        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("======================");

        //字符串分割 “." 的特殊写法
        String str3 = "aaa.bbb.ccc";
        String[] array3 = str3.split("\\.");

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }
}
