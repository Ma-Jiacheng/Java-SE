package Chapter15_泛型与集合框架.Demo_13_Collections集合工具类方法;

import java.util.ArrayList;
import java.util.Collections;

/*
Collections是集合工具类，用来对集合进行操作，部分方法如下：
    - public static <T> boolean addAll(Collection<T> c, T... elements)：往集合中添加一些元素
    - public static void shuffle(List<?> list)：打乱集合顺序
 */
public class Demo_13_01 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> arrayList = new ArrayList<>();

        //向集合中添加元素
        arrayList.add("甲");
        arrayList.add("乙");
        arrayList.add("丙");
        arrayList.add("丁");
        System.out.println(arrayList);

        //一次性添加多个方法
        Collections.addAll(arrayList,"戊", "己", "庚", "辛");
        System.out.println(arrayList);

        //打乱集合顺序
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
