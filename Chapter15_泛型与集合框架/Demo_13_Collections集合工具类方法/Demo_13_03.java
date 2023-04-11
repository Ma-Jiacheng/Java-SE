package Chapter15_泛型与集合框架.Demo_13_Collections集合工具类方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
- public static <T> void sort(List<T> list, Comparator<? super T>)：按照指定规则对集合元素进行排序
 */
public class Demo_13_03 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);

        Collections.sort(arrayList, new Comparator<Integer>() {
            //重写比较规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;     //升序
                return o2 - o1;     //降序
            }
        });

        System.out.println(arrayList);
    }
}
