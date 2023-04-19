package Chapter17_异常体系.Demo_07_finally代码块;
import java.io.IOException;

/*
finally代码块：
    编写格式：
        try{
            可能产生异常的代码;
        } catch(){
            异常的处理逻辑;（异常对象出现后，怎么处理异常对象）
        } finally{
            无论是否出现异常，都会执行此部分代码块
        }
    注意事项：
        1.finally不能单独使用，必须和try/catch一起使用
        2.finally一般用于资源释放（资源回收），无论程序是否出现异常，都要进行
 */
public class Demo_07 {
    public static void main(String[] args) {
        try {
            readFile("C:\\file.docx");  //可能会产生异常的代码
        } catch (IOException e) {
            e.printStackTrace();    //异常的处理逻辑
        } finally {
            System.out.println("进行资源释放！");
        }
    }

    public static void readFile(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名异常");
        }
        System.out.println("读取文件！");
    }

}
