package Chapter10_子类与继承.Demo_07;

public class Son extends Father {

    int num = 20;

    public Son(){
        super();    //通过super关键字访问父类构造方法，是默认编写好的
    }

    public void methodS(){
        System.out.println(super.num);  //通过super关键字访问父类中的num
    }

    public void method(){
        super.method();  //通过super关键字访问父类中的方法
        System.out.println("子类方法！");
    }
}
