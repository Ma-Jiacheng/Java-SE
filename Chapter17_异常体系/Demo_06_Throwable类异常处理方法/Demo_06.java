package Chapter17_异常体系.Demo_06_Throwable类异常处理方法;

import java.io.IOException;

/*
Throwable中定义了三个异常处理方法：
    1.String getMessage()：返回此 throwable 的简短描述
    2.String toString()：返回此 throwable 的详细信息
    3.void printStackTrace()：将此 throwable 及其追踪输出至标准错误流 （JVM默认调用此方法，信息最全面）
 */
public class Demo_06 {
    public static void main(String[] args) {
        //利用try/catch语句处理异常
        try{
            readFile("C:\\file.docx");
        } catch(IOException e){
            System.out.println(e.getMessage());     //异常简短描述

            System.out.println("=================");    //异常的详细信息

            System.out.println(e.toString());

            System.out.println("=================");    //异常的所有信息

            e.printStackTrace();
        }

        System.out.println("后续代码正常执行！");    //继续执行后续代码

    }

    public static void readFile(String fileName) throws IOException {   //将异常抛出给调用对象处理
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名异常！");  //抛出IOException
        }
        System.out.println("读取文件成功！");
    }
}
