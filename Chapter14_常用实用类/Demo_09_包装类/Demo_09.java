package Chapter14_常用实用类.Demo_09_包装类;

import java.util.ArrayList;

/*
基本类型与对应包装类对象之间来回转换的过程成为“装箱”与“拆箱”
    装箱：从基本类型转换为包装类对象，使用包装类的构造方法或静态方法
    拆箱：从包装类对象转换为基本类型，使用成员方法

自动装箱与自动拆箱：
    自从 JDK 1.5开始，基本类型的数据和包装类之间可以进行自动的互相转换
 */
public class Demo_09 {
    public static void main(String[] args) {
        //装箱——构造方法
        int num1 = 10;
        Integer integer1 = new Integer(num1);     //出现横线，说明该方法以过时
        System.out.println(integer1);

        //装箱——静态方法
        Integer integer2 = Integer.valueOf(num1);
        System.out.println(integer2);

        //拆箱——成员方法
        int num2 = integer1.intValue();
        System.out.println(num2);

        //自动装箱
        Integer num3 = 1;   //不需要手动或创建对象，会自动完成，转变为包装类

        //自动拆箱
        num3 = num3 + 1;    //num3之前为包装类，无法参与计算，所以在进行计算操作时，num3自动转换为基本数据类型

        //ArrayList集合无法存储整数，只能存储包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);    //自动装箱
        //get()方法从集合中获取元素，返回值为包装类型
        int num4 = list.get(0);     //自动拆箱
    }
}
