package Chapter06_面向对象编程.Demo_08_09_this关键字与构造方法;

//this关键字的作用

/*
当方法的局部变量和类的成员变量重名时，根据 “就近原则” 优先使用局部变量

如果需要访问本类当中的成员变量，需要使用格式： this.name

“通过谁调用的方法，谁就是this”，例如：通过对象 person 调用方法，this.name 就等于 person.name
 */

public class Person {
    String name;

    public void sayHello_1(String who) {
        System.out.println("你好" + who + "," + "我是" + name);
    }

    //将参数和成员变量名称都设置为 name
    //其中成员变量的name是自己的名字，参数的name是对方的名字
    public void sayHello_2(String name) {
        System.out.println("你好" + name + "," + "我是" + name);
    }

    public void sayHello_3(String name) {
        System.out.println("你好" + name + "," + "我是" + this.name);
    }
}
