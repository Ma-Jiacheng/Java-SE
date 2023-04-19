package Chapter17_异常体系.Demo_08_异常的注意事项.多异常捕获;

import java.util.List;

/*
异常的注意事项——多异常捕获：
    1.多个异常分别处理
    2.多个异常一次捕获，多次处理
        注意事项；
            1.catch里定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上面
    3.多个异常一次捕获，一次处理
 */
public class Demo_08 {
    public static void main(String[] args) {
        //多个异常分别处理
//        try {
//            int[] arr = {1, 2, 3, 4, 5, 6, 7};
//            System.out.println(arr[7]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
//        try {
//            List<Integer> list = List.of(1, 2, 3);
//            System.out.println(list.get(3));
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
//        System.out.println("后续代码执行！");

        //多个异常一次捕获，多次处理
//        try{
//            int[] arr = {1, 2, 3, 4, 5, 6, 7};
//            System.out.println(arr[7]);
//
//            List<Integer> list = List.of(1, 2, 3);
//            System.out.println(list.get(3));
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        } catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }

        //多个异常一次捕获，一次处理
        try{
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            System.out.println(arr[7]);

            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
