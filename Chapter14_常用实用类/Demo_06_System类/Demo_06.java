package Chapter14_常用实用类.Demo_06_System类;

import java.util.Arrays;

/*
java.lang.System类中提供了大量静态方法，可以获取与系统相关的信息或系统级操作，常用方法有：
    1.public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
    2.public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束
        参数：
            src - 源数组。
            srcPos - 源数组中的起始位置。
            dest - 目标数组。
            destPos - 目标数据中的起始位置。
            length - 要复制的数组元素的数量。
 */
public class Demo_06 {
    public static void main(String[] args) {

        method1();

        method2();

    }

    //public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
    public static void method1() {
        //获取一次当前的毫秒值
        long now = System.currentTimeMillis();
        System.out.println(now);

        for (int i = 0; i <= 9999; i++) {
            System.out.println("第" + i + "次循环执行！");
        }

        long past = System.currentTimeMillis();
        System.out.println("循环执行耗时：" + (past - now) + "ms");
    }

    public static void method2(){
        int[] arrOld = {1,3,5,7,9};
        int[] arrNew = new int[3];

        System.arraycopy(arrOld, 0, arrNew, 0, 3);
        System.out.println(Arrays.toString(arrNew));
    }
}


