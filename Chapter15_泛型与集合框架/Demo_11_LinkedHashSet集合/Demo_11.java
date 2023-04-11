package Chapter15_泛型与集合框架.Demo_11_LinkedHashSet集合;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
LinkedHashSet集合特点：
    底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表，记录元素的存储顺序，保证元素有序
 */
public class Demo_11 {
    public static void main(String[] args) {
        //普通HashSet集合
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("甲");
        hashSet.add("乙");
        hashSet.add("丙");
        hashSet.add("丁");
        System.out.println(hashSet);    // [丁, 甲, 乙, 丙]，存储和取出顺序不一定相同

        System.out.println("================");

        //linkedHashSet集合
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("甲");
        linkedHashSet.add("乙");
        linkedHashSet.add("丙");
        linkedHashSet.add("丁");
        System.out.println(linkedHashSet);  // [甲, 乙, 丙, 丁],存储和取出顺序完全相同
    }
}
