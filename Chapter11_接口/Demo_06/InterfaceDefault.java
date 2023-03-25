package Chapter11_接口.Demo_06;

public interface InterfaceDefault {
    public default void method(){
        System.out.println("这是接口的默认重名方法！");
    }
}
