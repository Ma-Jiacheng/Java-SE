package Chapter15_泛型与集合框架.Demo_03_增强for循环;

import java.util.ArrayList;

/*
增强for循环（也称for each循环），是JDK1.5之后增加的高级for循环，专门用来遍历数组和集合。
内部原理其实是Iterator迭代器，所以在遍历过程中，不能对集合中的元素进行增删操作

public interface Iterable<T>：实现这个接口允许对象称为“for each”语句的目标
Collection<E> extends Iterable<E>：所有点列集合都可以使用增强for

格式：
    for(集合/数组的数据类型 变量名 : 集合名/数组名){
        System.out.println(变量名);
    }
注意：
    1.增强for循环必须有被遍历的目标
    2.目标只能是Collection或者是数组
    3.增强for循环只能进行遍历操作
 */
public class Demo_03 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
        //使用增强for循环遍历数组
        for(int i : array){
            System.out.println(i);
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("甲");
        arrayList.add("乙");
        arrayList.add("丙");
        arrayList.add("丁");
        //使用增强for循环遍历集合
        for(String str : arrayList){
            System.out.println(str);
        }

    }
}
