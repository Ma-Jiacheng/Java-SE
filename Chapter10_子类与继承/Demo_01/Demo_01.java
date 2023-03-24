package Chapter10_子类与继承.Demo_01;

//继承的格式

/*
在继承的关系中，“子类就是一个父类”。也就是说，子类可以被当作父类看待
    例如：父类是员工类，子类是讲师类，那么“讲师就是一个员工”。

定义父类的格式：
    public class 父类名称{
        ......
    }

定义子类的格式：
    public class 子类名称 extends 父类名称{
        ......
    }
 */

public class Demo_01 {
    public static void main(String[] args) {
        //创建一个Teacher子类的对象
        Teacher teacher = new Teacher();
        //Teacher中虽然没有任何方法，但是会继承父类的method方法
        teacher.method();

        //创建一个Assistant子类的对象
        Secretary secretary = new Secretary();
        secretary.method();

        //通过继承实现代码复用
    }
}
