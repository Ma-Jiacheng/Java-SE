package Chapter14_常用实用类.日期时间类练习;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//计算一个人出生了多少天

/*
分析：
    1.获取一个人的出生年月以及当前的日期
        获取当前日期：Date date = new Date();
        获取出生日期：Scanner bir = new Scanner(System.in);
    2.将出生年月与当前日期转换为毫秒值
        将当前日期转换为毫秒值：long dateNow = date.getTime();
        将生日转换为毫秒值：
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateBir = simpleDateFormat.parse(bir);
            long dateBir = birthday.getTime();
    3.用当前日期毫秒值减去出生时间的毫秒值
        long birDate = dateNow - dateBir
    5.将差值转换为天数
        birDate/1000/60/60/24
 */
public class Demo {
    public static void main(String[] args) throws ParseException {

        //获取当前日期
        Date date = new Date();
        //获取出生日期
        System.out.println("请输入你的出生日期（****-**-**）：");
        Scanner sc = new Scanner(System.in);
        String bir = sc.next();

        //将当前日期转换为毫秒值
        long dateNow = date.getTime();
        //将出生日期转换为毫秒值
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");     //创建SimpleDateFormat对象，参数为字符串格式
        Date birthday = simpleDateFormat.parse(bir);    //将字符串解析为Date型
        long dateBir = birthday.getTime();      //将Date型日期转换为毫秒值

        //求当前日期与出生日期的差值
        long howLong = dateNow - dateBir;

        //将差值毫秒值转换为天数
        int days = (int) (howLong/1000/60/60/24);
        System.out.println("你已经在这个星球上生活了" + days +"天");

    }
}
