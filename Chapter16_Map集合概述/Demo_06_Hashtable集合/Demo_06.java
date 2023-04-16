package Chapter16_Map集合概述.Demo_06_Hashtable集合;
import java.util.HashMap;
import java.util.Hashtable;

/*
Hashtable实现了Map接口

Hashtable：底层也是一个哈希表，是一个线程安全的集合，即单线程集合，速度慢
HashMap：底层是一个哈希表，是一个线程不安全的集合，即多线程集合，速度快

HashMap集合：可以存储null值，null键
Hashtable集合：不能存储null值，null键

Hashtable和Vector集合一样，在JDK 1.2之后被更先进的集合（HashMap、ArrayList）取代
Hashtable的子类Properties依然在使用，是唯一一个和IO流集结合的集合
 */
public class Demo_06 {
    public static void main(String[] args) {
        //HashMap允许存储空键空值
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null, null);
        hashMap.put(null, "Java");
        hashMap.put("Java", null);

        System.out.println(hashMap);

        //Hashtable不允许存储空值空键
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put(null, null);    //存储空值空键会发生空指针异常
        hashtable.put(null, "Java");
        hashtable.put("Java", null);

        System.out.println(hashtable);
    }
}
