package Chapter16_Map集合概述.Demo_02_Map集合遍历方式;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map集合遍历方法：
    - Set<K> keySet()：返回此映射中包含的键的Set视图
        1.将Map集合中所有key取出来存放到Set集合中
        2.然后使用迭代器或增强for循环即可遍历key
        3.通过遍历的key，再使用get方法即可遍历value
 */
public class Demo_02 {
    public static void main(String[] args) {
        //创建集合对象
        Map<Integer, String> map = new HashMap<>();
        //添加元素
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "Python");
        map.put(4, "PHP");
        //将Map集合的key存储到Set集合
        Set<Integer> set = map.keySet();
        //遍历Set集合的keu，同时使用get方法遍历value
        for (Integer i : set) {
            System.out.println(map.get(i));
        }
    }
}
