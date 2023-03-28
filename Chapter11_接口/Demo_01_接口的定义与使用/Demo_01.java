package Chapter11_接口.Demo_01_接口的定义与使用;

//接口的基本定义
//接口的抽象方法定义及使用

/*
接口就是多个类的公共规范
接口是一种引用数据类型，最重要的内容就是其中的抽象方法

定义接口的基本格式：
    public interface 接口名称{
        接口内容;
    }
备注：关键字 class 改为 interface 后，编译生成的字节码文件仍然是 .java --> .class

接口的使用方法：
    1.接口不能直接进行使用，必须有一个 “实现类” 来 “实现” 该接口
        格式：
            public class 实现类名称 implements 接口名称{
                ......
            }
    2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法
    3.创建实现类的对象进行使用

注意事项：如果实现类没有覆盖重写接口中所有抽象方法，那这个实现类就必须是抽象的
 */
public class Demo_01 {
    public static void main(String[] args) {
        //错误写法！不能直接 new 接口对象使用
//        MyInterfaceAbstract inter = new MyInterfaceAbstract();

        //创建实现类对象使用
        InterfaceAbstractImpl impl = new InterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }
}
