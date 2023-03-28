package Chapter11_接口.Demo_04_接口的私有方法;

/*
从 Java 9 开始，接口中允许定义私有方法
    1.普通私有方法：解决多个默认方法之间的重复代码问题
        private 返回值类型 方法名称（参数列表）{}
    2.静态私有方法：解决多个静态方法之间的重复代码问题
        private static 返回值类型 方法名称（参数列表）{}
 */
public interface InterfacePrivateA {
    //两个不同的方法间有很多相同的代码
    public default void methodDefault1(){
        System.out.println("这是默认方法 1");
//        System.out.println("A");
//        System.out.println("B");
//        System.out.println("C");
    }
    public default void methodDefault2(){
        System.out.println("这是默认方法 2");
//        System.out.println("A");
//        System.out.println("B");
//        System.out.println("C");
    }

    //定义一个方法，内容为重复的代码，解决重复问题
    //又增加了一个新的公共方法，不过这个方法应该只供接口内部使用，方法不应该让实现类使用
//    public default void methodCommon(){
//        System.out.println("A");
//        System.out.println("B");
//        System.out.println("C");
//    }

    //修改后
    private void methodPrivateCommon(){
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
    }
}
