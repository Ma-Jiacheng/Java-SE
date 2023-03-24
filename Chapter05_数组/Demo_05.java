package Chapter05_数组;

//数组作为方法参数、方法返回值

/*
数组作为方法参数：
    1.数组可以作为方法的参数
    2.当调用方法时，向方法的小括号进行传参，传递的实际上是数组的地址值

数组作为返回值：
    1.一个方法可以有0个，1个，多个参数，但是只能有0个或1个返回值
    2.使用数组作为返回值类型可返回多个结果数据
 */

public class Demo_05 {
    public static void main(String[] args) {
        //调用数组遍历方法
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        printArray(array1);

        //调用计算方法使用数组返回值
        int[] array2 = calculate(10,20,30);
        System.out.println("Sum = " + array2[0]);
        System.out.println("Mul = " + array2[1]);
        System.out.println("Avg = " + array2[2]);
    }

    //数组类型作为方法的参数
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //数组作为返回值
    public static int[] calculate(int a,int b,int c){
        int sum = a+b+c;
        int mul = a*b*c;
        int avg = sum/3;

        //动态返回
//        int[] array1 = new int[3];
//        array1[0] = sum;
//        array1[1] = mul;
//        array1[2] = avg;

        //静态返回
        int[] array2 = {sum,mul,avg};

//        return array1;
        return array2;
    }
}
