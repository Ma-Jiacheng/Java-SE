package Chapter11_接口.Demo_06_继承与接口;

public interface InterfaceB {

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法B！");
    };

}
