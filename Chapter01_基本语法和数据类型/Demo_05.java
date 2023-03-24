package Chapter01_基本语法和数据类型;

//变量的注意事项

/*
变量使用注意事项：
    1.如果创建多个变量，变量名称不可以相同
    2.对于float和long类型变量，"F"和“L”后缀不可丢掉
    3.对于byte和short类型变量，右侧数值不可超过变量类型取值范围
    4.没有赋值的变量，不可直接使用，需先赋值
    5.变量使用不能超过作用域范围（作用域：从变量定义开始至所属大括号为止）
    6.可同时创建多个同类型变量
 */
public class Demo_05 {
    public static void main(String[] args) {
        //相同名称的变量
        int num1 = 10;  //创建一个新变量，名为num1
        //int num1 = 20;  //又创建一个新变量，名称与已有变量重复，错误！
        System.out.println(num1);

        //使用未赋值的变量
        //int num2;   //变量未被赋值
        //System.out.println(num2);   //直接使用未被赋值的变量，错误！

        //超出作用域的变量使用，在创建变量之前使用，错误！
        //System.out.println(num3);
        //int num3 = 30;

        //超出作用域的变量使用，在所属大括号之后使用，错误！
        //{
        //  int num4 = 40;
        //}
        //  System.out.println(num4);

        //同时创建多个同类型变量
        int a = 10, b = 20, c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}


