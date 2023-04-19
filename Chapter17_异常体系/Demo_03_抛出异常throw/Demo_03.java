package Chapter17_异常体系.Demo_03_抛出异常throw;

/*
throw关键字；
    作用：使用throw关键字在指定的方法中抛出指定的异常
    使用格式；throw new xxxException("异常产生的原因")
    注意事项：
        1.throw关键字必须写在方法的内部
        2.throw关键字后边new的对象必须是Exception或Exception的子类对象
        3.throw关键字抛出指定的对象，就必须处理这个异常对象（如果是RuntimeException，可以不处理，默认由JVM进行处理）
 */
public class Demo_03 {
    public static void main(String[] args) {
//        int[] arr1 = null;
//        int num1 = getElement(arr1, 1);  //java.lang.NullPointerException: 传递的数组值为null
//        System.out.println(num1);

        int[] arr2 = {1,2,3,4,5,6,7};
        int num2 = getElement(arr2, -1);    //java.lang.ArrayIndexOutOfBoundsException: 索引越界
        int num3 = getElement(arr2, 7);
        System.out.println(num2);
        System.out.println(num3);
    }

    /*
    定义一个方法，获取数组指定索引处的元素
    参数：int arr[]
         int index
    如果参数不合法，就必须使用抛出异常的方式告知方法的调用者，传递的参数有问题
    */
    public static int getElement(int[] arr, int index){
        /*
        对传递进来的参数进行合法性校验
            1.如果数组arr的值为null，则抛出空指针异常告知方法的调用者
            2.如果index范围不在数组的索引范围内，则抛出数组索引越界异常告知方法的调用者
         */
        if(arr == null){
            throw new NullPointerException("传递的数组值为null");
        }
        if(index < 0 || index > arr.length - 1){
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }
        return arr[index];
    }

}
