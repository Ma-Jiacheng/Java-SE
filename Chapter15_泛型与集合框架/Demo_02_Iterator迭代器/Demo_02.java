package Chapter15_泛型与集合框架.Demo_02_Iterator迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
迭代的概念；
    即Collection集合元素的通用获取方式。在取元素之前先判断集合中有没有元素，如果有，就把这个元素取出来，继续再判断，如果还有就再取出来。
    直到集合中所有元素全部取出。这种取出方式专业术语称为迭代

Iterator接口，也叫迭代器，其中有两个常用方法：
    1.boolean hasNext()：判断集合中是否有下一个元素可以迭代，如果有则返回true
    2.E next()：返回迭代的下一个元素
注意；
    1.Iterator迭代器是一个接口，无法直接使用。需要使用Iterator接口的实现类对象，
    2.获取实现类的方式比较特殊，Collection接口中有一个方法叫iterator()，由该方法返回Iterator的实现类
    3.Iterator<E> iterator()，返回在此Collection的元素上进行迭代的迭代器

迭代器的使用步骤：
    1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
    2.使用Iterator接口中的方法hasNext()判断还有没有下一个元素
    3.使用Iterator接口接口中的方法next()取出集合中的下一个元素
 */
public class Demo_02 {
    public static void main(String[] args) {

        //创建一个集合对象
        Collection<String> collection = new ArrayList<>();

        //向集合中添加元素
        collection.add("篮球");
        collection.add("足球");
        collection.add("乒乓球");

        //使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收
        Iterator<String> iterator = collection.iterator();

        //使用Iterator接口中的方法hasNext()判断还有没有下一个元素
        //使用Iterator接口接口中的方法next()取出集合中的下一个元素
//        boolean bool1 = iterator.hasNext();
//        System.out.println("集合中是否还有元素：" + bool1);   //true，集合中还有元素
//        String str1 = iterator.next();  //取出该元素
//        System.out.println("取出元素：" + str1);
//
//        boolean bool2 = iterator.hasNext();
//        System.out.println("集合中是否还有元素：" + bool2);   //true，集合中还有元素
//        String str2 = iterator.next();  //取出该元素
//        System.out.println("取出元素：" + str2);
//
//        boolean bool3 = iterator.hasNext();
//        System.out.println("集合中是否还有元素：" + bool3);   //true，集合中还有元素
//        String str3 = iterator.next();  //取出该元素
//        System.out.println("取出元素：" + str3);
//
//        boolean bool4 = iterator.hasNext();
//        System.out.println("集合中是否还有元素：" + bool4);   //false，集合为空

        //迭代去取出过程代码重复，可以使用循环进行优化
        //未知有多少个元素，使用while循环l；已知多少个元素，使用for循环
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println("取出元素：" + str);
        }

    }
}
