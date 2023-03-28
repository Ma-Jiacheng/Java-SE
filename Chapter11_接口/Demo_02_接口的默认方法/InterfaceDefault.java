package Chapter11_接口.Demo_02_接口的默认方法;

/*
从 Java 8 开始，接口里允许定义默认方法

定义格式：
    public default 返回值类型 方法名称（参数列表）{
        方法体；
    }
备注：接口当中的默认方法，可以解决接口升级问题
 */
public interface InterfaceDefault {
    //抽象方法
    public abstract void methodAbs();

    //使用 MyInterfaceDefaultImplA 和 MyInterfaceDefaultImplB 两个类实现该接口

    //又新添加了一个抽象方法
//    public abstract void methodAbs2();
    //接口实现类必须实现所有抽象方法，如果新添加一个，实现类也必须修改

    //将新添加的方法改为默认方法解决此问题
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法！");
    }
}
