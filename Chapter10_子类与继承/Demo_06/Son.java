package Chapter10_子类与继承.Demo_06;

public class Son extends Father{

//    public Son(){
//        System.out.println("子类构造方法！");
//    }

    public Son(){
//        super();    //调用父类无参构造方法
        super(10);  //调用父类重载的构造方法
        System.out.println("子类构造方法！");
    }

    public void method(){
//        super(10);  //错误！只有子类构造方法才能调用父类构造方法
    }
}
