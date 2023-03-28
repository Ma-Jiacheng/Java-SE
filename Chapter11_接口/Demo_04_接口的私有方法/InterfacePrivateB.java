package Chapter11_接口.Demo_04_接口的私有方法;

public interface InterfacePrivateB {

    public static void methodStatic1(){
        System.out.println("这是静态方法 1");
//        System.out.println("A");
//        System.out.println("B");
//        System.out.println("C");
    }

    public static void methodStatic2(){
        System.out.println("这是静态方法 2");
//        System.out.println("A");
//        System.out.println("B");
//        System.out.println("C");
    }

    private static void methodStaticCommon(){
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
    }

}
