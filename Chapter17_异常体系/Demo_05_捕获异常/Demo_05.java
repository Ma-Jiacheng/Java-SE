package Chapter17_异常体系.Demo_05_捕获异常;

import java.io.IOException;

/*
try/catch语句捕获异常：自己处理异常
    编写格式：
        try{
            可能产生异常的代码;
        } catch(){
            异常的处理逻辑;（异常对象出现后，怎么处理异常对象）
        }
        ......
        catch(异常类名 变量名){

        }
    注意事项：
        1.try中可能会抛出多个异常，那么可以使用多个catch语句处理异常
        2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕后继续执行后续代码
        3.如果try中没有产生异常，那么不会执行catch语句中的处理逻辑
 */
public class Demo_05 {
    public static void main(String[] args) {
        try{    //利用try/catch语句处理异常
            readFile("C:\\file.docx");
        } catch(IOException e){
            System.out.println("传递的文件后缀名异常！");  //输出异常原因
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
