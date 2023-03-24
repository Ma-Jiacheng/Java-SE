package Chapter05_数组;

//数组的使用

/*
访问数组元素的格式：数组名称[索引值]
注意：
    1.索引值就是一个int型数字，代表数组元素的编号
    2.索引值从0开始，直到 ”数组长度-1“ 位置

数据存入数组的格式：数组名称[索引值] = 数据值
 */

public class Demo_02 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};      //初始化静态数组
        System.out.println(array1);      //直接打印数组，得到的使数组对应的内存地址哈希值

        System.out.println(array1[0]);   //10，数组第一个元素
        System.out.println(array1[1]);   //20，数组第二个元素
        System.out.println(array1[2]);   //30，数组第三个元素

        int num = array1[1];     //将数组元素赋值给变量
        System.out.println(num);    //结果为20

        int[] array2 = new int[3];      //初始化动态数组
        array2[0] = 10;     //为动态数组赋值
        array2[1] = 20;
        array2[2] = 30;

    }
}
