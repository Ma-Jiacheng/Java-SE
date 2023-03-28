package Chapter14_常用实用类.Demo_02_Object类的equals方法;

//Object类的equals方法

import java.util.Objects;

/*
拓展：
    在JDK 7添加了一个Objects工具类，它提供了一些方法来操作对象，由一些静态方法组成，这些方法是null-save（空指针安全的）
    或null-tolerant（空指针容忍的），用于计算对象的hashcode、返回对象的字符串表示形式、比较两个对象
 */
public class Demo_02 {
    public static void main(String[] args) {

        //Person类默认继承了Object类，所以可以使用Object类的equals方法
        //boolean equals(Object obj)指示其它某个对象是否与此对象“相等”
        Person person1 = new Person("路人甲", 21);
        Person person2 = new Person("过客乙", 22);
        Person person3 = new Person("过客乙", 22);

        /*
        equals方法源码：
            public boolean equals (Object obj){
                return (this == obj);
            }
        参数：
            Object obj：可以传递任意对象
        方法体：
            “==”：比较运算符，返回一个boolean值
            基本数据类型：比较的是值
            引用数据类型：比较的是地址值
            this：哪个对象调用的equals，this就是哪个对象
        */
        boolean result1 = person1.equals(person2);
        System.out.println(result1);

        boolean result2 = person2.equals(person3);
        System.out.println(result2);

        System.out.println("=====================");

        //Objects方法
        String s1 = null;
        String s2 = "abc";
        //使用普通重写方法，会出现空指针异常
//        boolean b1 = s1.equals(s2);
//        System.out.println(b1);  //java.lang.NullPointerException
        //使用Objects方法
        /*
        public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }
        */
        boolean b2 = Objects.equals(s1, s2);
        System.out.println(b2);     //Objects方法是null-save（空指针安全的）或null-tolerant（空指针容忍的）
    }
}
