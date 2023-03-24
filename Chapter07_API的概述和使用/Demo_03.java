package Chapter07_API的概述和使用;
import java.util.Scanner;

//匿名对象作为方法的参数和返回值

public class Demo_03 {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //匿名对象使用方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的内容为：" + num);
        
        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        method(sc);
        
        //使用匿名对象
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static void methodParam(Scanner sc){
        int num= sc.nextInt();
        System.out.println("匿名对象输入的是：" + num);
    }

    public static Scanner methodReturn(){
        //一般写法
//        Scanner sc = new Scanner(System.in);
//        return sc;

        //匿名对象写法
        return new Scanner(System.in);
    }
}
