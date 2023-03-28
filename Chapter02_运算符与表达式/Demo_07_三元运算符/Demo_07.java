package Chapter02_运算符与表达式.Demo_07_三元运算符;

//三元运算符

/*
一元运算符：只需要一个数据就可以进行运算操作（取反！、自增++、自减--）
二元运算符：需要两个数据进行操作的运算符（四则运算、赋值）
三元运算符：需要三个数据才可以进行操作的运算符

格式：
    数据类型 变量名称 = 条件判断 ？ 表达式A ：表达式B

流程：
    判断条件是否成立-->若成立为true-->将表达式A的值赋给左侧的变量
                 -->若不成立为false-->将表达式B的值付给左侧变量
    二者选其一

注意事项：
    1.必须同时保证表达式A和表达式B都符合左侧数据类型要求，例如：int result = a >b ? 2.5 : 10; (错误)
    2.三元运算符的结果必须被使用
 */
public class Demo_07 {
    public static void main(String[] args) {
        //二选一取最大值
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;    //若a>b成立，将a的值赋给max，若不成立，将b的值赋给max
        System.out.println(max);    //max = 20 = b
    }
}
