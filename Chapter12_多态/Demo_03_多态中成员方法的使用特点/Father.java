package Chapter12_多态.Demo_03_多态中成员方法的使用特点;

public class Father {

    int num = 10;

    public void showNum(){
        System.out.println(num);
    }

    public void method(){
        System.out.println("父类方法！");
    }

    public void methodF(){
        System.out.println("父类特有方法！");
    }
}
