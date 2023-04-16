package Chapter16_Map集合概述.Demo_05_LinkedHashMap集合;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
LinkedHashMap:
    Map接口的哈希表和链接列表实现,具有可预知的迭代顺序
    底层为哈希表+链表结构，链表用于记录迭代顺序
 */
public class Demo_05 {
    public static void main(String[] args) {
        //HashMap集合
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "张三");
        hashMap.put(3, "王五");
        hashMap.put(2, "李四");
        System.out.println(hashMap);    //存取顺序不一定一致

        System.out.println("==================");

        //LinkedHashMap集合
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "张三");
        linkedHashMap.put(3, "李四");
        linkedHashMap.put(2, "王五");
        System.out.println(linkedHashMap);      //存取顺序一致

    }
}
