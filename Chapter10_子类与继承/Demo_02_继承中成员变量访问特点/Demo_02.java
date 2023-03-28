package Chapter10_子类与继承.Demo_02_继承中成员变量访问特点;

//继承中成员变量的访问特点

/*
在父类子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式
    1.直接通过子类对象访问成员变量
        等号左边是谁，就优先用谁，没有则向上查找
    2.间接通过成员方法访问成员变量
        该方法属于谁就优先使用谁的成员变量，没有再向上查找
 */

public class Demo_02 {
    public static void main(String[] args) {
        //父类与子类成员变量不重名
        Father father = new Father();
        System.out.println(father.numF);    //10，父类只能使用父类内容，不能使用子类内容
        Son son = new Son();
        System.out.println(son.numF);
        System.out.println(son.numS);

        System.out.println("==================");

        //父类与子类成员变量重名

        //直接通过子类对象访问成员变量
        System.out.println(son.num);    //200，直接访问子类成员变量

        //间接通过成员方法访问成员变量
        son.methodS();  //200，使用子类的方法，优先使用子类成员变量，没有再向上查找父类
        son.methodF();  //100，使用父类的方法，优先使用父类成员变量
    }
}
