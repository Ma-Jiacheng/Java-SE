package Chapter14_常用实用类.Demo_07_08_StringBuilder类;

/*
StringBuilder和String可以相互转换：
    1.String-->StringBuilder：可以使用StringBuilder的构造方法
        StringBuilder(String str)：构造一个字符串生成器，并初始化为指定的字符串内容
    2.StringBuilder--<String：可以使用StringBuilder中的toString方法
        String toString()：将当前StringBuilder对象转换为String对象
 */
public class Demo_08 {
    public static void main(String[] args) {

        //String-->StringBuilder
        String str1 = "HelloWorld";
        System.out.println("String：" + str1);
        StringBuilder strB = new StringBuilder(str1);
        System.out.println("StringBuilder：" + strB);

        //StringBuilder-->String
        String str2 = strB.toString();
        System.out.println("String：" + str2);
    }
}
