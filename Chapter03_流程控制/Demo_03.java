package Chapter03_流程控制;

//选择语句

/*
选择语句格式：
    switch(表达式){
        case 常量值1：
            语句体1；
            break;
        case 常量值2:
            语句体2;
            break；
        ......
        default:
            语句体n+1;
            break;
先计算表达式的值，然后依次和case的常量值比较，若满足则执行该case对应的语句体，执行完后直接跳出switch语句，若都不满足，则执行default语句体

注意事项：
    1.多个case后面的数值不可以相同
    2.switch语句的括号中只能是byte/short/char/int数据类型
    3.switch语句格式很灵活，前后顺序可以颠倒，break语句可以省略
 */
public class Demo_03 {
    public static void main(String[] args) {
        int week = 3;
        switch(week){
            case 1:
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("今天星期二");
                break;
            case 3:
                System.out.println("今天星期三");    //结果
                break;
            case 4:
                System.out.println("今天星期四");
                break;
            case 5:
                System.out.println("今天星期五");
                break;
            case 6:
                System.out.println("今天星期六");
                break;
            case 7:
                System.out.println("今天星期天");
                break;
            default:
                System.out.println("没有这个日期");
                break;  //最后一个break可以省略
        }
    }
}
