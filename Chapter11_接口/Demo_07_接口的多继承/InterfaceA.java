package Chapter11_接口.Demo_07_接口的多继承;

public interface InterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodRepeat(){
        System.out.println("接口A中的重复方法！");
    }
}
