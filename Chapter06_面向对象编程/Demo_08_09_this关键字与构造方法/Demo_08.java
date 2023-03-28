package Chapter06_面向对象编程.Demo_08_09_this关键字与构造方法;

public class Demo_08 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "马家成";

        person.sayHello_1("路人甲");   //局部变量和成员变量不重名

        person.sayHello_2("路人甲");   //局部变量和成员变量重名，就近优先使用局部变量

        person.sayHello_3("路人甲");   //局部变量和成员变量重名，就近优先使用局部变量，使用this关键字使用成员变量

    }
}
