package Chapter01_基本语法和数据类型;

//变量的概念与定义格式
//变量的基本使用

/*
变量：程序运行期间，内容可以发生改变的量
创建变量的格式：
    1.先创建，后赋值
    数据类型 变量名称（例：int x）  //创建一个变量
    变量名称 = 数据值（例：x = 100）   //赋值，将右边数值赋值给左边变量
    2.一步到位
    数据类型 变量名称 = 数据值（例：int x = 100）  //格式不同，含义与第一种方法相同
 */
public class Demo_04 {
    public static void main(String[] args) {
        //int型
        int num2 = 300;
        System.out.println(num2);
        num2 = 400;    //改变变量数值
        System.out.println(num2);

        //byte型
        byte num3 = 23;     //变量取值范围不可超过数据类型取值范围
        System.out.println(num3);
        //byte num4 = 128;  //超出数据类型取值范围，错误！

        //short型
        short num5 = 30;
        System.out.println(num5);

        //long型
        long num6 = 900;
        System.out.println(num6);

        //float型
        float num7 = 3.14F;
        System.out.println(num7);

        //double型
        double num8 = 2.28;
        System.out.println(num8);

        //char型
        char letter = 'A';
        System.out.println(letter);

        //boolean型
        boolean var1 = true;
        System.out.println(var1);
        boolean var2 = false;
        System.out.println(var2);
        var1 = var2;    //将右边变量的内容赋值给左边变量，即将var2的false值赋值给var1，改变var1原有的true
        System.out.println(var1);
    }
}

