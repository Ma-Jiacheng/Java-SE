package Chapter14_常用实用类.Demo_04_时间格式化DateFormat类;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//DateFormat类

/*
java.text.DateFormat类：是日期/时间格式化子类的抽象类
    作用；
        格式化（日期-->文本）、解析（文本-->日期）
    成员方法：
        String format(Date date)：按照指定的模式把Date格式化为符合模式的字符串
        Date parse(String source)：把符合模式的字符串解析为Date日期
    DateFormat是一个抽象类，无法直接创建对象使用，可以创建其子类对象

SimpleDateFormat(String pattern)：用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
    参数：String pattern：传递指定的模式
    模式：区分大小写
        y   年
        M   月
        d   日
        H   时
        m   分
        s   秒
    例：yyyy-MM-dd HH:mm:ss 或 yyyy年MM月dd日 HH时mm分ss秒...等
 */
public class Demo_04 {
    public static void main(String[] args) throws ParseException {

        method1();

        System.out.println("========================");

        method2();

    }

    //String format(Date date)：按照指定的模式把Date格式化为符合模式的字符串
    private static void method1() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String text = simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(text);
    }

    //Date parse(String source)：把符合模式的字符串解析为Date日期
    private static void method2() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse("2023-03-27 18:32:21");
        System.out.println(date);
    }
}
