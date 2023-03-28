package Chapter02_运算符与表达式.Demo_01_四则运算;

//运算符与表达式

/*
    运算符：进行特定操作的符号，例如‘+’进行加运算
    表达式：用运算符连接起来的式子叫做表达式，例如：a+b
    注意：一旦运算中有不同的数据类型，那么结果将会是数据类型范围较大的那种
 */
public class Demo_01 {
    public static void main(String[] args) {
        //四则运算：加+，减-，乘*，除/
        int a = 20;
        int b = 30;
        System.out.println(a + b);    //加法运算，结果为50
        System.out.println(a - b);    //减法运算，结果为-10
        System.out.println(a * b);    //乘法运算，结果为600
        System.out.println(a / b);    //除法运算，只取整数部分，结果为0

        //取余运算--对于整数运算才有意义
        int x = 10;
        int y = 3;
        System.out.println(x % 3);    //取余运算，结果为1


    }
}
