package Chapter16_Map集合概述.Demo_03_Entry键值对;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map.Entry<K,V>：在Map接口中有一个内部接口Entry
    接口作用：
        当Map集合创建时，就会在Map集合中创建一个Entry对象，用来记录键与值（键与值的映射关系）
    获取Entry对象：
        1.Set<Map.Entry<K,V>> entrySet()：返回此映射中包含的映射关系，存储到Set集合中
        2.遍历Set集合，获取每一个Entry对象
        3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class Demo_03 {
    public static void main(String[] args) {
        //创建集合对象
        Map<Integer, String> map = new HashMap<>();
        //添加元素
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "Python");
        map.put(4, "PHP");
        //获取Entry对象
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        //遍历Set集合，获取映射关系
        for (Map.Entry<Integer, String> entry : set) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
