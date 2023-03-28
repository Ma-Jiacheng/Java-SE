package Chapter13_内部类.Demo_03_内部类的概念;

//内部类的概念与分类
//成员内部类的定义
//成员内部类的使用
//成员内部类同名变量访问

/*
如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类，例如：身体与心脏、汽车与发动机

内部类的分类：
    1.成员内部类
    2.局部内部类（包含匿名内部类）

成员内部类的定义格式：
    修饰符 class 外部类名称{
        修饰符 class 内部类名称{
            ......
        }
        ......
    }
注意：内部类使用外部类可以随意访问，外部类用内部类一定需要借助内部类对象

编译器生成的.class文件形式：
    外部类：OutSide.class
    内部类:Outside$InSide.class

如何使用成员内部类？
    1.【间接方式】：在外部类的方法中使用内部类，然后main只是调用外部类方法
    2.【直接方式】：创建内部类对象：外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
 */
public class Demo_03 {
    public static void main(String[] args) {

        //间接访问内部类方法
        //main中只写外部类方法，然后通过外部类方法访问内部类方法，使main间接访问内部类方法
        Outer outer = new Outer();
        outer.methodOut();

        //直接访问内部类方法
        Outer.Inner inner = new Outer().new Inner();     //创建内部类对象
        inner.methodIn();  //通过内部类对象直接访问内部类方法
    }
}
