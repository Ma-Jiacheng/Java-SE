package Chapter11_接口.Demo_02;

//接口的默认方法定义及使用

/*
注意：
    1.接口的默认方法，可以通过接口的实现类对象直接调用
    2.接口的默认方法，也可以被接口的实现类进行覆盖重写
 */

public class Demo_02 {
    public static void main(String[] args) {
        //创建实现类对象
        InterfaceDefaultImplA a = new InterfaceDefaultImplA();

        //调用抽象方法，实际运行的是实现类的方法
        a.methodAbs();

        //调用默认方法，如果实现类中没有，会向上找接口的方法
        a.methodDefault();

        System.out.println("======================");

        //同理，B也可以实现
        InterfaceDefaultImplB b = new InterfaceDefaultImplB();
        b.methodAbs();
        b.methodDefault();
    }
}
