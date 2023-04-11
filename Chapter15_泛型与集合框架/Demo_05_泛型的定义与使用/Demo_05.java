package Chapter15_泛型与集合框架.Demo_05_泛型的定义与使用;

public class Demo_05 {
    public static void main(String[] args) {
        //定义一个泛型类
        //不使用泛型
        GenericClass genericClass1 = new GenericClass();
        genericClass1.setName("只能是字符串!");
        System.out.println(genericClass1.getName());

        //使用泛型
        GenericClass<Integer> genericClass2 = new GenericClass<>();
        genericClass2.setNames(921);
        System.out.println("设置为int型：" + genericClass2.getNames());

        GenericClass<String> genericClass3 = new GenericClass<>();
        genericClass3.setNames("设置为String型！");
        System.out.println(genericClass3.getNames());

        System.out.println("=======================");

        //定义一个泛型方法
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.method("字符串");
        genericMethod.method(10);
        genericMethod.method(true);
        //静态泛型方法
        GenericMethod.methodStatic(3.14);
        GenericMethod.methodStatic('A');

        System.out.println("========================");

        //使用一个泛型接口
        GenericInterfaceImpl1 genericInterfaceImpl1 = new GenericInterfaceImpl1();
        genericInterfaceImpl1.method("Mjc");

        GenericInterfaceImpl2<String> genericInterfaceImpl2= new GenericInterfaceImpl2<>();
        genericInterfaceImpl2.method("0921");

    }
}
