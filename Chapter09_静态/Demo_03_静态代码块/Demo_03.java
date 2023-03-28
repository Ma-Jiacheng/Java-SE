package Chapter09_静态.Demo_03_静态代码块;

//静态代码块

/*
静态代码块格式：
    public class 类名称{
        static{
            静态代码块内容
        }
    }
特点：
    1.当第一次用到本类时，静态代码块执行唯一的一次！
    2.静态内容总是优先于非静态，静态代码块比构造方法先执行

用途：用来一次性的对静态成员变量进行赋值

 */
public class Demo_03 {
    public static void main(String[] args) {
        //静态内容总是优先于非静态，静态代码块比构造方法先执行
        Person one = new Person();

        //静态代码块只执行一次
        Person two = new Person();
    }
}
