package Chapter11_接口.Demo_07_接口的多继承;

//接口之间的多继承

/*
接口之间的多继承关系：
    1.类与类之间是单继承的，直接父类只有一个
    2.类与接口之间是多实现的，一个类可以实现多个接口
    3.接口与接口之间是多继承的
 */
public class Demo_07 {

    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();
        impl.methodRepeat();
    }
}
