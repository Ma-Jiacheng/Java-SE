package Chapter05_数组.Demo_04_数组常用操作;

//数组的常用操作

/*
获取数组长度：
    使用 数组名称.length ，将会得到一个int数值，代表该数组的长度
注意：数组一旦被创建，在程序运行时长度无法改变

数组遍历输出：
    1.获取数组长度
    2.利用循环结构依次读取数组每个元素

获取数组中的最值：
    1.设置一个最值变量
    2.将数组某个值赋给最值变量
    3.让剩余的数组元素依次与其比较，若更大（或更小）的替换最值变量为该元素
    4.最小值同理
 */

public class Demo_04 {
    public static void main(String[] args) {
        //动态初始化数组长度
        int[] array1 = new int[3];  //动态初始化数组 [] 括号中数值即为数组长度
        //静态初始化数组长度
        int[] array2 = {1, 4, 5, 7, 56, 34, 3, 58, 89, 23, 23};     //  静态数长度无法直观展示
        int len = array2.length;    //获取数组长度
        System.out.println("数组的长度：" + len);

        //数组遍历
        int[] array3 = {1, 4, 5, 7, 56, 34, 3, 58, 89, 23, 23, 2, 43, 67, 98};
        for (int i = 0; i < len; i++) {
            System.out.println(array2[i]);
        }

        //获取数组中的最值
        int[] array4 = {1, 4, 5, 7, 56, 34, 3, 58, 89, 23, 23, 2, 43, 67, 98};
        int max = array4[0];
        for (int i = 1; i < array4.length; i++) {
            if (array4[i] > max) {
                max = array4[i];
            }
        }
        System.out.println("数组元素最大值为：" + max);

        //数组元素的反转
        int[] array5 = {1, 2, 3, 4, 5};
        for (int i = 0, j = array5.length - 1; i < j; i++, j--) {
            int temp = array5[i];
            array5[i] = array5[j];
            array5[j] = temp;
        }
        for (int i = 0; i < array5.length; i++) {
            System.out.println(array5[i]);
        }
    }
}
