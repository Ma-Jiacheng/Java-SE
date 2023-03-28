package Chapter07_API的概述和使用.Demo_04_Random类;

//Random类

/*
Random类用来生成随机数字，使用分为三个步骤：
    1.导包: import java.util.Random
    2.创建: Random r = new Random()
    3.使用: 获取一个随机 int 数 (范围是整个 int，有正有负) ：int num = r.nextInt()
           获取一个随机 int 数 （参数代表范围，左闭右开区间）：int num = r.nextInt(3) —— 范围为 [0,3)
 */

import java.util.Random;
public class Demo_04 {
    public static void main(String[] args) {
        //生成一个 int 范围内的随机数
        Random r = new Random();
        int num1 = r.nextInt();
        System.out.println("生成的随机数是：" + num1);

        //生成一个一定范围内的随机 int 数
        int num2 = r.nextInt(10);   //生成 0~9 的随机数
        System.out.println("生成的随机数是：" + num2);
    }
}
