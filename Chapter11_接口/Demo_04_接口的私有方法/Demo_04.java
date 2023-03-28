package Chapter11_接口.Demo_04_接口的私有方法;

//接口的私有方法定义及使用

public class Demo_04 {
    public static void main(String[] args) {
        //静态方法修改后
        InterfacePrivateB.methodStatic1();
        InterfacePrivateB.methodStatic2();
//        MyInterfacePrivateB.methodStaticCommon();     //正确！无法访问
    }
}
