package Chapter15_泛型与集合框架.Demo_04_泛型;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型是一种位置的数据类型，当我们不知道该使用什么数据类型的时候，可以使用泛型
泛型也可以看成是一个变量，用来接收数据类型
    例如：
        E e ：Element元素
        T T ：Type类型

集合在定义的时候，不知道会存储什么数据类型，所以使用泛型
    public class ArrayList<E>{
        ......
    }

创建集合对象的时候，将数据类型作为参数传递，就会确定泛型的数据类型
    ArrayList<String> arrayList = new ArrayList<String>();

创建集合对象，不使用泛型
    优点：集合不使用泛型，默认就是Object类型，可以存储任意类型的数据
    缺点：不安全，会引发异常

创建集合对象，使用泛型
    优点：
        1.避免了类型转换的麻烦，存储的是什么类型，取出就是什么类型
        2.把运行期异常（代码执行之后会抛出的异常）提升到了编译期（写代码的时候就会报错）
    缺点：泛型是什么数据类型就只能存储什么类型的数据
 */
public class Demo_04 {
    public static void main(String[] args) {

        method1();

        method2();

    }

    private static void method1(){
        //创建集合对象，不使用泛型
        ArrayList arrayList = new ArrayList();  //默认类型为Object类型
        arrayList.add("ABC");
        arrayList.add(10);
        //遍历集合
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
            //如果想要使用String类的特有方法.length获取字符串的长度，则需要向下转型，因为 Object obj = “ABC”使用了多态
            String str = (String) obj;
            System.out.println(str.length());   //会抛出ClassCastException异常，不能把Integer类型转换为String类型
        }
    }

    private static void method2(){
        //创建集合对象，使用泛型
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("ABC");
//        arrayList.add(10);  //在编译期就会报错

        //遍历集合
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
            System.out.println(str.length());
        }
    }

}
