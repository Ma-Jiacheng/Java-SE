package Chapter06_面向对象编程;

//面向对象的封装性

/*
面向对象的三大特征：封装、继承、多态

封装性在Java中的体现：
    1.方法就是一种封装
    2.关键字 private 也是一种封装

封装：将一些细节信息隐藏起来，对于外界不可见
 */

public class Demo_06 {
    public static void main(String[] args) {
        int[] array = {1, 6, 23, 34, 56, 76, 99};
        int max = getMax(array);    //将具体的求最大值步骤封装为 getMax() 方法
        System.out.println("数组最大值是：" + max);
    }

    public static int getMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
