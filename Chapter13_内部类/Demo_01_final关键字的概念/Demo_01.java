package Chapter13_内部类.Demo_01_final关键字的概念;

//final关键字的概念与四种用法

/*
final关键字代表最终的、不可改变的，常见有四种用法：
    1.可以用来修饰一个类
    2.可以用来修饰一个方法
    3.可以用来修饰一个局部变量
    4.可以用来修饰一个成员变量
 */
public class Demo_01 {

    public static void main(String[] args) {
        //对于普通变量，值是可变的
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        System.out.println("===============");

        //使用final修饰普通变量，就不可更改
        final int num2 = 100;
        System.out.println(num2);
//        num2 = 200;   //错误写法！

        //正确写法！只要保证只有一次赋值操作即可
        final int num3;
        num3 = 200;

        //对于基本类型来说，不可改变指变量中的数据不可改变
        //对于引用类型来说，不可改变指变量中的地址不可改变
    }

}
