package Chapter17_异常体系.Demo_01_异常分类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
异常分类：
    Exception：编译期异常，编写Java源代码过程中出现的问题
        RuntimeException：运行期异常，Java程序运行过程中出现的问题
    Error：错误，代码无法进行编译，必须修改源代码，程序才能继续执行

异常的处理方法：
    使用throws语句，将异常交给虚拟机处理，会中断程序的运行，将异常打印在控制台
    使用try/catch环绕，将异常处理，打印异常至控制台，继续执行后续代码
 */
public class Demo_01 {
    public static void main(String[] args) /* throws ParseException */ {
        //Exception：编译期异常，编写Java源代码过程中出现的问题
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        Date date = null;
//        try {
//            date = sdf.parse("2023-04-16");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(date);

        //RuntimeException：运行期异常，Java程序运行过程中出现的问题
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        try{
//            System.out.println(array[8]);
//        }catch (Exception e){
//            System.out.println(e);
//        }

        //Error：错误，代码无法进行编译，必须修改源代码，程序才能继续执行
        int[] array = new int[1024 * 1024 * 1024];  //java.lang.OutOfMemoryError，内存溢出错误，超出JVM分配的内存
    }
}
