package Chapter02_运算符与表达式;

//自增、自减运算符

/*
自增运算符：++    自减运算符：--
基本含义：让一个变量增加数字1或减少数字1
使用方法：写在变量名称之前或变量名称之后，例如：num++、--num
使用方式：
    1.单独使用：不宇其它任何操作混合，自己成为一个独立步骤
    2.混合使用：和其他操作混合，例如与赋值混合，或与打印操作混合
使用区别：
    1.在单独使用时，前++和后++无任何区别
    2.在混合使用时，有很大的区别
        （1）：如果是前++，那么变量马上+1，然后使用+1后的结果 —— 先加后用
        （2）：如果是后++，那么先使用一次原变量值，使用完后进行+1 —— 先用后加
 */
public class Demo_03 {
    public static void main(String[] args) {
        //单独使用的前++或后++
        int num1 = 10;
        System.out.println(num1);   //10
        num1++;
        System.out.println(num1);   //11
        ++num1;
        System.out.println(num1);   //12

        //与打印操作混合使用前++或后++
        int num2 = 20;
        System.out.println(++num2);    //21，数值20先+1，后进行打印输出使用
        int num3 = 30;
        System.out.println(num3++);    //30，数值30先进行打印输出，后进行+1
        System.out.println(num3);   //31，上一语句进行++后的数值

        // --操作与++操作同理
    }
}
