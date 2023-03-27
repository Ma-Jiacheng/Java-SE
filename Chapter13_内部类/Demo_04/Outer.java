package Chapter13_内部类.Demo_04;

//内部类的成员变量访问

/*
如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量名
 */

public class Outer {

    int num = 10;   //外部类成员变量

    public class Inner{
        int num = 20;   //内部类的成员变量

        public void methodInner(){
            int num = 30;   //内部类方法的局部变量
            System.out.println(num);    //局部变量，就近原则
            System.out.println(this.num);   //this关键字使用内部类的成员变量
//            System.out.println(super.num);    //内部类与外部类不是继承关系，不能使用super关键字使用外部类成员变量
            System.out.println(Outer.this.num);     //使用该方式访问外部类成员变量
        }
    }
}
