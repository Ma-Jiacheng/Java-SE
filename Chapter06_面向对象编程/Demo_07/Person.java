package Chapter06_面向对象编程.Demo_07;

/*
问题描述：定义 person 的年龄是，无法阻止负数等不合理数值被设置进来
解决方案：用 private 关键字将需要保护的成员变量进行修饰

一旦使用 private 进行修饰，那么本类当中任然可以进行修饰。但是超出本类范围就不能在直接进行访问

间接访问 private 成员变量，就是定义一对 getter 和 setter 方法

注意事项：
    1.必须使用 set*** 和 get*** 的命名规则
    2.对于 getter 不能有参数，返回值类型和成员变量对应
    3.对于 setter 不能有返回值，参数类型和成员变量对应
    4.对于基本类型中的布尔类型，其 getter方法 编写格式为 is*** ，setter方法不变
 */

public class Person {
    String name;
    private int age;

    public void showMessage() {
        System.out.println("姓名：" + name + ", " + "年龄：" + age);
    }

    //这个成员方法专门用于向 age 设置数据
    public void setAge(int num){
        age = num;
        if(num>100||num<0){
            System.out.println("数据不合理");
        }
        else{
            age = num;
        }
    }
    //这个成员方法专门用于获取 age 数据
    public int getAge() {
        return age;
    }
}
