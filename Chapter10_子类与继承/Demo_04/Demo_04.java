package Chapter10_子类与继承.Demo_04;

//继承中成员方法的访问特点

/*
在父子类的继承关系中，创建子类对象，访问成员方法的规则：创建的对象是谁就优先用谁，若没有则向上寻找

注意事项：
    无论是成员方法还是成员变量，如果没有都是向上找父类，不能向下找子类
 */

public class Demo_04 {
    public static void main(String[] args) {
        //子类方法与父类方法不重名
        Son son = new Son();
        son.methodF();  //子类对象调用父类方法
        son.methodS();  //子类对象调用子类方法

        System.out.println("===================");

        //子类方法与父类方法重名
        son.method();   //创建子类对象，优先使用子类方法
    }
}
