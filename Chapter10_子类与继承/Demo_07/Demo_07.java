package Chapter10_子类与继承.Demo_07;

//super关键字的用法

/*
super关键字的三种用法：
    1.在子类的成员方法中，访问父类的成员变量
    2.在子类成员方法中，访问父类成员方法
    3.在子类的构造方法中访问父类构造方法
 */
public class Demo_07 {
    public static void main(String[] args) {
        //在子类的成员方法中，访问父类的成员变量
        Son son = new Son();
        son.methodS();

        System.out.println("==================");

        //在子类的成员方法中，访问父类的成员方法
        son.method();
    }
}
