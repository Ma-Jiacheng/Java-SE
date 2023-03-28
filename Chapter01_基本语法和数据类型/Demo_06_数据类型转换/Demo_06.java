package Chapter01_基本语法和数据类型.Demo_06_数据类型转换;

//数据类型转换-自动转换
//数据类型转换-强制转换
//数据类型转换的注意事项

/*
自动转换（隐式）：
    1.特点：代码不需要进行特殊处理，自动完成
    2.规则：将取值范围小的数据类型转换为取值范围大的数据类型
强制转换（显式）：
    1.特点：代码需要进行特殊处理，不能自动完成
    2.格式：范围小的类型 范围小的变量名 = （范围小的类型）原本范围大的数据
注意事项：
    1.强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出
    2.byte/short/char类型都可以发生数学运算
    3.byte/short/char类型在发生数学运算时，都会被提升为int型，然后再进行计算
    4.boolean类型不能发生数据类型转换
 */
public class Demo_06 {
    public static void main(String[] args) {
        System.out.println(1024);   //整数，默认为int类型
        System.out.println(3.14);   //小数，默认为double类型

        //Java中要求参与计算的数据，必须要保证数据类型一致性，如果数据类型不一致将发生类型转换

        //自动类型转换
        //左右数据类型不一样，将会发生类型转换
        long num1 = 100;
        System.out.println(num1);   //符合数据范围由小向大的转换要求，将发生数据类型转换

        double num2 = 2.5F;
        System.out.println(num2);   //符合数据范围由小向大的转换要求，将发生数据类型转换

        float num3 = 30L;
        System.out.println(num3);   //符合数据范围由小向大的转换要求，将发生数据类型转换


        //强制类型转换
        int num4 = (int) 100L;   //100未超过int类型范围
        System.out.println(num4);

        int num5 = (int) 6000000000L;    //强制类型转换格式正确，不会报错，但是超出int表示范围，发生数据溢出现象
        System.out.println(num5);   //结果：1705032704

        int num6 = (int) 3.99;   //强制类型转换格式正确，不会报错，但是会舍弃所有小数部分，产生精度损失
        System.out.println(num6);

        char ch = 'A';
        System.out.println(ch + 1);   //结果为66，也就是字符A被当作65进行处理

        byte num7 = 40;
        byte num8 = 50;
        //byte result = num7 + num8;  //在进行运算时，num7和num8已经被提升为int，不能转换为byte，报错
        int result = num7 + num8;   //正确用例
        System.out.println(result);
    }
}
