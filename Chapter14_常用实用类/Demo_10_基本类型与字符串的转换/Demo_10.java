package Chapter14_常用实用类.Demo_10_基本类型与字符串的转换;

/*
基本类型与字符串之间的转换：
    基本类型-->字符串；
        1.基本类型数据值 + ""
        2.使用包装类中的静态方法 toString()
        3.使用String类中的静态方法 valueOf()
    字符串-->基本类型：
        使用包装类的静态方法 parse**(String)
 */
public class Demo_10 {
    public static void main(String[] args) {
        //基本类型转换为字符串
        String str1 = 123 + "";
        System.out.println(str1 + 200);

        int num1 = 123;
        String str2 = Integer.toString(num1);
        System.out.println(str2 + 200);

        int num2 = 123;
        String str3 = String.valueOf(num2);
        System.out.println(str3 + 200);

        //字符串转换为基本类型
        String str4 = "123";
        int num3 = Integer.parseInt(str4);
        System.out.println(num3 + 200);
    }
}
