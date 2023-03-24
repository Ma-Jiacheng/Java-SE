package Chapter02_运算符与表达式;

//比较运算符

/*
比较运算符包括：
    ==，比较两边结果是否相等
    <，比较左边数据是否小于右边数据
    >，比较左边数据是否大于右边数据
    <=，比较左边数据是否小于或等于右边数据
    <=，比较左边数据是否大于或等于右边数据
    ！=，比较两边结果是否不相等

注意：比较运算符的运算结果均为布尔值 true或false
 */
public class Demo_05 {
    public static void main(String[] args) {
        System.out.println(1 == 1);   //true
        System.out.println(1 == 2);   //false


        System.out.println(3 < 4);   //true
        System.out.println(4 <= 3);   //false

        System.out.println(5 > 2);   //true
        System.out.println(5 <= 2);   //false

        System.out.println(1 != 2);   //true
        System.out.println(1 != 1);   //false
    }
}
