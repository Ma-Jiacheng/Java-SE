package Chapter06_面向对象编程.Demo_07_private关键字;

//private关键字的作用及其使用

/*
问题描述：定义 person 的年龄是，无法阻止负数等不合理数值被设置进来
解决方案：用 private 关键字将需要保护的成员变量进行修饰

一旦使用 private 进行修饰，那么本类当中任然可以进行修饰。但是超出本类范围就不能在【直接】进行访问
 */

public class Demo_07 {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "马家成";
//        person.age = -21;   //直接访问 private 内容，错误写法！

        person.setAge(-20);     //使用 private 关键字使其不能直接访问成员变量，只能间接访问，并在间接访问中设置数据要求
        person.setAge(20);
        person.showMessage();
    }
}
