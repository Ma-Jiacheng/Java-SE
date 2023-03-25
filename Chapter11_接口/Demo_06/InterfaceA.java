package Chapter11_接口.Demo_06;

public interface InterfaceA {

    //错误写法！接口不能有静态代码块
//    static{}
    //错误写法，接口不能有构造方法
//    public Interface(){}

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法A！");
    };

}
