package Chapter03_流程控制.Demo_02_判断语句;

//判断语句——根据判断语句条件判定是否执行语句体，若为判断语句为true则执行，若为false则不执行或执行else语句

/*
判断语句包括：
    1.if语句
    2.if...else...语句
    3.if...else if...else...
判断语句格式：
    if（关系表达式）{
        语句体；
    }
    else{
        语句体;
    }
 */

public class Demo_02 {
    public static void main(String[] args) {
        int age = 16;

        if (age > 18) {
            System.out.println("成年人");
        } else {
            System.out.println("未成年人");
        }
    }
}
