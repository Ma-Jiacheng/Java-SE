package Chapter02_运算符与表达式.Demo_06_逻辑运算符;

//逻辑运算符

/*
逻辑运算符连接两个布尔值，代表两个条件
逻辑运算符包括：
    与（并且）：符号为 “&&”，左右均为true才为true
    或（或者）：符号为 “||”，左右有一个为true就为true
    非（取反）：符号为 “！”，true变为false，false变为true

注意事项：
    1.与 “&&” 运算以及或 “||” 运算具有短路效果：如果根据左边以及可以判断得到最终结果，则右边代码将不在执行，从而节省一定的性能
    2.与、或运算需要左右两个布尔值，非运算只需要一个
    3.与、或两种运算符如果有多个条件，可以连续写，例如：条件1 && 条件2 && 条件3
 */
public class Demo_06 {
    public static void main(String[] args) {
        System.out.println(true && true);   //true
        System.out.println(3 < 4 && 10 < 5);  //false

        System.out.println(true || false);  //true
        System.out.println(3 > 4 || 10 < 5);    //false

        System.out.println(true);   //true
        System.out.println(!(4 > 3));    //false
    }
}
