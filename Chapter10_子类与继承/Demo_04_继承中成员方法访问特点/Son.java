package Chapter10_子类与继承.Demo_04_继承中成员方法访问特点;

public class Son extends Father{
    public void methodS(){
        System.out.println("子类方法执行！");
    }

    public void method(){
        System.out.println("子类方法执行！");
    }
}
