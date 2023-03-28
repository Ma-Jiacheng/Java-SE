package Chapter11_接口.Demo_03_接口的静态方法;

//接口的静态方法定义及使用

/*
注意：不能通过接口实现类来调用接口当中的静态方法

正确使用方法：通过接口名称直接调用其中的静态方法
 */
public class Demo_03 {
    public static void main(String[] args) {
        //创建实现类对象
        InterfaceStaticImpl impl = new InterfaceStaticImpl();

        //错误写法！
//        impl.methodStatic

        //直接通过接口名称进行调用
        InterfaceStatic.methodStatic();
    }
}
