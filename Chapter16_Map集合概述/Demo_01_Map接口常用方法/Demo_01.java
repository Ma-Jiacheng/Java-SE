package Chapter16_Map集合概述.Demo_01_Map接口常用方法;

import java.util.HashMap;
import java.util.Map;

/*
Map接口常用方法：
    - V put(K key, V value)：将指定的值与此映射中的指定键关联（可选操作）
    - V get(Object key)：返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回null
    - V remove(Object key)：如果存在一个键的映射关系，则将其从此映射中移除（可选操作）
    - boolean containsKey(Object key)：如果此映射包含指定键的映射关系，则返回true

V put(K key, V value)：将指定的值与此映射中的指定键关联（可选操作）
    返回值V：
        存储键值对的时候，key不重复，则返回null
        存储键值对的时候，key重复，则使用新的value值替换Map中已有的value值，返回被替换的value值

V remove(Object key)：如果存在一个键的映射关系，则将其从此映射中移除（可选操作）
    返回值V：
        key存在，V返回被删除的值
        key不存在，V返回null

V get(Object key)：返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回null
    返回值V：
        key存在，返回key对应的值
        key不存在，返回null

boolean containsKey(Object key)：如果此映射包含指定键的映射关系，则返回true
    判断集合中是否包含指定的key：
        包含返回true
        不包含返回false
 */
public class Demo_01 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String, String> map = new HashMap<>();

        String s1 = map.put("一号元素", "Java");    //添加元素
        System.out.println("返回值：" + s1);    //打印返回值返回null
        String s2 = map.put("二号元素", "C++");
        System.out.println("返回值：" + s2);
        String s3 = map.put("二号元素", "Python");  //添加key重复的元素
        System.out.println("返回值：" + s3);
        String s4 = map.put("三号元素", "C++");
        System.out.println("返回值：" + s4);

        System.out.println("集合元素：" + map);    //key不能重复，所以v2会直接替换v1。value可以重复，所以v3可以直接存储到集合中
        System.out.println("========================");

        //删除不存在的元素
        String r1 = map.remove("四号元素");
        System.out.println("返回值：" + r1);
        //删除存在的元素
        String r2 = map.remove("三号元素");
        System.out.println("返回值：" + r2);

        System.out.println("集合元素：" + map);
        System.out.println("========================");

        //获取key存在的元素值
        String g1 = map.get("一号元素");
        System.out.println("返回值：" + g1);
        //获取key不存在的元素值
        String g2 = map.get("四号元素");
        System.out.println("返回值：" + g2);

        System.out.println("========================");

        //不包含key，返回false
        boolean c1 = map.containsKey("四号元素");
        System.out.println("返回值：" + c1);
        //包含key，返回true
        boolean c2 = map.containsKey("一号元素");
        System.out.println("返回值：" + c2);

    }
}
