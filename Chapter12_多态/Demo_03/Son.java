package Chapter12_多态.Demo_03;

public class Son extends Father {

    int num = 20;

    @Override
    public void showNum(){
        System.out.println(num);
    }

    @Override
    public void method(){
        System.out.println("子类方法！");
    }

    public void methodS(){
        System.out.println("子类特有方法！");
    }
}
