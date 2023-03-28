package Chapter09_静态.Demo_03_静态代码块;

public class Person {
    static {
        System.out.println("静态代码块执行！");
    }

    public Person(){
        System.out.println("构造方法执行！");
    }
}
