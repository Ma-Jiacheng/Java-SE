package Chapter06_面向对象编程.Demo_02;

//类和对象
//类的定义

/*
类：一组相关属性和行为的集合，可以看作一类事物的模板，使用事物的属性特征和行为特征来描述该类事物，是抽象的
    属性：该事物的状态信息
    行为：该事物能够做什么
例：
    定义一个类，用来模拟 “学生” 事物，其中有两个组成部分：
        1.属性（成员变量）：
            String name;     //姓名
            int age;    //年龄
        2.行为（成员方法）：
            public void eat() {}    //吃饭
            public void sleep() {}  //睡觉
            public void study() {}  //学习
注意事项：
    1.成员变量是直接定义在类中，在方法外边
    2.成员方法不要写 static 关键字

对象：是一类事物的具体体现。对象是类的一个实例，必然具备该类事物的属性和行为，是具体的
 */

public class Student {
    //成员变量
    String name;    //姓名
    int age;    //年龄

    //成员方法
    public void eat(){
        System.out.println("学生在吃饭");
    }

    public void sleep(){
        System.out.println("学生在睡觉");
    }
    public void study(){
        System.out.println("学生在学习");
    }
}
