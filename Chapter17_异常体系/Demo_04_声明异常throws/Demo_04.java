package Chapter17_异常体系.Demo_04_声明异常throws;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
throws关键字：异常处理的第一种方式，交给别人处理
    作用：
        当方法内部抛出异常对象的时候，就必须处理这个异常对象
        可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理（自己不处理，抛给别人），最终抛给JVM
    使用格式：在方法声明时使用
        修饰符 返回值类型 方法名（参数列表） throws ***Exception, xxxException...{
            throw new ***Exception("产生原因");
            throw new xxxException("产生原因");
            ......
        }
    注意事项：
        1.throws关键字必须写在方法声明处
        2.throws关键字后面声明的异常必须是Exception或者是Exception的子类
        3.方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常（如果抛出的多个异常有子父类关系，那么直接声明父类）
        4.调用了一个抛出异常声明的方法，就必须进行处理声明的异常（要么继续使用throws抛出，要么使用try/catch自己处理）
*/
public class Demo_04 {
    //FileNotFoundException extends IOException，所以可以只声明父类异常即可
    public static void main(String[] args) throws IOException {
//    public static void main(String[] args) throws FileNotFoundException, IOException {
//        readFile("D:\\message.txt");
        readFile("C:\\message.dat");
    }

    /*
    定义一个方法，对传递的文件路径进行合法性判断
        如果路径不是 “C:\\message.txt”，那么就抛出文件查询失败异常，告知方法的调用者
     */
    public static void readFile(String fileName) throws FileNotFoundException, IOException {
//        if(!fileName.equals("C:\\message.txt")){
//            throw new FileNotFoundException("文件路径异常");
//        }

        if(!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名异常");
        }

        System.out.println("读取文件！");
    }

}
