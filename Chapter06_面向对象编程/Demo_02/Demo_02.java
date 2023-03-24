package Chapter06_面向对象编程.Demo_02;

//类的使用

/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象才能使用
使用方式：
    1.导包：指出需要使用的类，类在什么位置
        格式：import 包名称.类名称
        注意：对于和当前类属于同一个包的情况，导包语句可以省略不写
    2.创建：创建一个需要使用的类的对象
        格式：类名称 对象名称 = new 类名称（）;
    3.使用：使用类分两种情况
        （1）使用成员变量：对象名.成员变量名
        （2）使用成员方法：对象名.成员方法名（参数）
*/

public class Demo_02 {
    public static void main(String[] args) {
        //使用上个例子创建的 Student 类

        // 1.导包：因为 Student 类和 自己 第6章_面向对象编程.Demo_31 处于同一个包中，所以省略导包语句

        //2.创建
        Student Mjc = new Student();    //根据 Student 类创建一个名为 Mjc 的对象

        //3.使用
        // （1）使用成员变量
        System.out.println(Mjc.name);   // name 未赋值，结果为默认值 null
        System.out.println(Mjc.age);    // age未赋值，结果为默认值 0

        // （2）为成员变量赋值
        Mjc.name = "马家成";
        Mjc.age = 21;
        System.out.println(Mjc.name);   //结果为 "马家成"
        System.out.println(Mjc.age);    //结果 21

        // （3）使用成员方法
        Mjc.eat();  //使用 Student 类的 eat（） 方法
        Mjc.sleep();    //使用 Student 类的 sleep（） 方法
        Mjc.study();    //使用 Student 类的 study（） 方法

    }
}
