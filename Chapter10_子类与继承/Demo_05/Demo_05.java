package Chapter10_子类与继承.Demo_05;

//继承者方法的覆盖重写

/*
重写（Override）：在继承关系中，方法的名称一样，参数列表也一样

方法重写和方法重载的区别：
    重写：方法的名称一样，方法的参数列表也【一样】
    重载：方法的名称一样，参数列表【不一样】

方法的重写特点：创建的是子类对象，则优先用子类方法

方法重写的注意事项：
    1.必须保证父子类之间方法名称相同、参数列表相同
        @Override，写在方法之前，用来检测是不是有效的重写
    2.子类方法的返回值必须小于等于父类方法的返回值范围
    3.子类方法的权限必须大于等于父类方法的权限修饰符
        public->protected->(default)->private
        注：default代表什么都不写，留空
 */

public class Demo_05 {
    public static void main(String[] args) {
        //老款手机
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();

        System.out.println("=================");

        //新款手机
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
