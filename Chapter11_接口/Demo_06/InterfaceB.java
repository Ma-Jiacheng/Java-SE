package Chapter11_接口.Demo_06;

public interface InterfaceB {

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法B！");
    };

}
