package Chapter10_子类与继承.Demo_06;

//继承中构造方法的访问特点

/*
继承关系中，构造方法的访问特点：
    1.子类构造方法中，有一个默认隐含的 super() 调用，所以一定是先调用父类构造方法，再调用子类构造方法
    2.子类构造可以通过 super 关键字来调用父类重载构造
    3.super 的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次super构造
 */
public class Demo_06 {
    public static void main(String[] args) {
        //子类必须调用父类构造方法
        Son son = new Son();
    }
}
