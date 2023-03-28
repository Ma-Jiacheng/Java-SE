package Chapter05_数组.Demo_03_数组异常;

//数组异常

/*
数组索引越界异常（ArrayIndexOutOfBoundsException）：
    数组的索引号从 0 开始，到 数组长度-1 为止，访问数组元素时，索引编号并不存在，将会发生数组索引越界异常
    原因：索引标号编写错误
    解决方案：修改成为存在的正确索引编号

空指针异常（NullPointerException）：
    数组必须进行 new 操作进行初始化后才能使用其中元素，如果只是赋值为 null 没有进行 new 创建，将会发生空指针异常

 */

public class Demo_03 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        System.out.println(array1[0]);   //10
        System.out.println(array1[1]);   //20
        System.out.println(array1[2]);   //30
        System.out.println(array1[13]);   //索引值超过数组范围，发生数组索引越界异常

        int[] array2 = null;    //所有引用类型都可赋值为 null
        System.out.println(array2[0]);  //使用为进行 new 创建的数组，发生空指针异常
    }
}
