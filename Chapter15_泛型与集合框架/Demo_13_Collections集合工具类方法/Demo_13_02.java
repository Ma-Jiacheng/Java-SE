package Chapter15_泛型与集合框架.Demo_13_Collections集合工具类方法;

import java.util.ArrayList;
import java.util.Collections;

/*
- public static <T> void sort(List<T> list)：将集合中的元素按照默认规则排序
    默认规则：按照升序排列
    注意事项：
        sort方法使用前提：被排序的集合里存储的元素必须实现Comparable，重写接口中的方法compareTo定义排序的规则
 */
public class Demo_13_02 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<Integer> arrayList = new ArrayList<>();
        //向集合中添加元素
        Collections.addAll(arrayList, 1,2,3,4,5,6,7);
        //打乱元素顺序
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        //对集合再进行排序
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
