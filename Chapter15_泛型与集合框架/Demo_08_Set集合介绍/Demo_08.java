package Chapter15_泛型与集合框架.Demo_08_Set集合介绍;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set接口的特点：
    1.不允许存储重复的元素
    2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历

Set接口的实现类HashSet特点：
    1.不允许存储重复的元素
    2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
    3.是一个无序的集合，存储和取出元素的顺序可能不一致
    4.底层是一个哈希表结构；查询速度非常快

Set集合不允许存储重复元素的原理；
    1.Set集合在调用add方法的时候，add方法会调用元素的hashCode方法，判断集合中是否存在该哈希值对应的元素
    2.如果没有，则直接将该元素存储至集合中
    3.如果有，则出现哈希冲突，调用equals方法比较所有哈希值相同的元素，如果返回true，则两元素相同，不会进行存储。如果为false，则进行存储
 */
public class Demo_08 {
    public static void main(String[] args){
        //创建一个HashSet集合
        Set<Integer> set = new HashSet<>();

        //使用add方法往集合添加元素
        set.add(7);
        set.add(9);
        set.add(2);
        set.add(1);
        set.add(7);

        //遍历集合
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());    //1->2->7->9，存储顺序和取出顺序不一致。
        }

        System.out.println("=========================");

        //增强for循环遍历
        for(Integer i : set){
            System.out.println(i);  //最后一位7未被存储，不能存储重复元素
        }

    }
}
