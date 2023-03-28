package Chapter11_接口.Demo_06_继承与接口;

public interface InterfaceDefault {
    public default void method(){
        System.out.println("这是接口的默认重名方法！");
    }
}
