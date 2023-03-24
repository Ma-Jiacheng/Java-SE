package Chapter06_面向对象编程;

//成员变量和局部变量

/*
成员变量和局部变量的不同：
    1.定义的位置不一样
        局部变量：定义在方法的内部
        成员变量：定义在方法的外部，直接写在类当中
    2.作用范围不一样
        局部变量：只有方法中才可以使用，超出方法就不可以使用
        成员变量：整个类全部都可以使用
    3.默认值不一样
        局部变量：没有默认值，要想使用，必须手动赋值
        成员变量：如果没有手动赋值，会有默认值，默认值同数组一样
    4.内存位置不一样
        局部变量：位于栈内存
        成员变量：位于堆内存
    5.生命周期不一样
        局部变量：随着方法进栈诞生，随着方法出栈消失
        成员变量：随着对象创建诞生，随着对象被回收消失
 */
public class Demo_05 {
    String name;    //成员变量

    public void methodA() {
        int num;    //局部变量
//        System.out.println(num);    //错误！ 不赋值的局部变量不能使用
        System.out.println(name);   //结果为默认值
    }

    public void methodB() {
//        System.out.println(num);    //错误！ A方法中定义的局部变量只能在方法A中使用
        System.out.println(name);   //类中定义的成员变量在类中都可以使用
    }
}
