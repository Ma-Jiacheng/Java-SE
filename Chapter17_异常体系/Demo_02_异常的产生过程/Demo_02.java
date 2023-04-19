package Chapter17_异常体系.Demo_02_异常的产生过程;

/*
异常产生过程解析：
    当程序中出现异常行为被JVM检测到时，JVM会做两件事：
        1.JVM会根据异常产生的原因创建一个异常对象，包含异常产生的内容、原因、位置
            例如：new ArrayIndexOutOfBoundsException("7")
        2.在发生异常的方法中没有异常处理逻辑（try/catch），那么JVM就会把异常对象抛出给方法的调用者main方法来处理这个异常

    main方法接收到该异常对象，也没有异常的处理逻辑，继续把异常对象抛出给main方法的调用者JVM

    JVM接收到这个异常对象，会做两件事情：
        1.把异常对象（内容、原因、位置）以红色字体打印在控制台
        2.JVM会进行中断处理，终止当前正在执行的Java程序

 */
public class Demo_02 {
    public static void main(String[] args) {
        //创建int型数组并赋值
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //获取数组元素
        int num1 = getElement(arr, 0);
        System.out.println(num1);
        //获取不在索引内的元素
        int num2 = getElement(arr, 7);  //ArrayIndexOutOfBoundsException 数组索引越界异常
        System.out.println(num2);
    }

    //获取数组指定索引处的元素
    private static int getElement(int[] arr, int index) {
        int result = arr[index];

        return result;
    }
}
