package Chapter11_接口.Demo_07_接口的多继承;

public interface InterfaceB {

    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodRepeat(){
        System.out.println("接口B中的重复方法！");
    }
}
