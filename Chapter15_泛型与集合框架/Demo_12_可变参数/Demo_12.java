package Chapter15_泛型与集合框架.Demo_12_可变参数;

/*
可变参数是JDK 1.5之后出现的新特性
使用前提：
    当方法的参数数据类型已确定，但是参数的个数不确定，就可以使用可变参数
使用格式：
    修饰符 返回值类型 方法名(数据类型...变量名){
        方法体;
    }
可变参数的原理：
    可变参数底层是一个数组，根据传递参数的个数不同，创建不同长度的数组来存储这些参数

注意事项：
    1.一个方法的参数列表，只能由一个可变参数
    2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
 */
public class Demo_12 {
    public static void main(String[] args) {
        int sum = getSum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        System.out.println(sum);
    }

    //定义一个方法，计算两个整数的和
    public static int add(int a, int b) {
        return a + b;
    }

    //定义一个方法，计算三个整数的和
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    //过于繁琐，可以使用可变参数
    public static int getSum(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

}
