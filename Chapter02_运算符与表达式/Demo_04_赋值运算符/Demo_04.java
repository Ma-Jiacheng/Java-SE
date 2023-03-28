package Chapter02_运算符与表达式.Demo_04_赋值运算符;

//赋值运算符

/*
赋值运算符分类：
    1.基本赋值运算 “=” ，将符号右侧数据交给左侧，例如：int a = 10
    2.复合赋值运算：
        +=，例如：a += 3 相当于 a = a+3
        -+：例如：a -= 3 相当于 a = a-3
        *=：例如：a *= 3 相当于 a = a*3
        /+：例如：a /= 3 相当于 a = a/3
        %=：例如：a %= 3 相当于 a = a%3

    3.注意事项：
        （1）：只有变量才能进行赋值运算，常量不能写在赋值运算符左边，例如：10 = 20
        （2）：复合赋值运算中隐含了一个强制类型转换
 */
public class Demo_04 {
    public static void main(String[] args) {
        int num = 10;   //基本赋值运算

        num += 5;   //  +=赋值运算
        System.out.println(num);    //15，相当num = 10+5

        num -= 5;   //  -=赋值运算
        System.out.println(num);    //10，相当num = 15-5

        num *= 3;   //  *=赋值运算
        System.out.println(num);    //30，相当num = 10*3

        num /= 3;   //  /=赋值运算
        System.out.println(num);    //10，相当num = 30/3

        num %= 3;   //  %=赋值运算
        System.out.println(num);    //1，相当num = 10%3

    }
}
