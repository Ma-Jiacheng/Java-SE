package Chapter04_方法.Demo_04_方法重载;

//方法重载的基本使用

/*
方法重载（OverLoad）：对于功能类似的方法，因为参数列表不一样就需要定义多个方法太过繁琐，因此引入方法重载技术使多个方法的名称相同，但有不一样的参数列表
                   调用时会根据主函数传入的参数自动匹配对应的方法

优点：只需要使用一个相同的方法名，就能实类似的多种功能

方法重载与下列因素相关：
    1.参数个数不同
    2.参数类型不同
    3.参数的多类型顺序不同

方法重载与下列因素无关：
    1.与参数的名称无关
    2.与方法的返回值类型无关
 */
public class Demo_04 {
    public static void main(String[] args) {
        //以加法为例
        System.out.println(add(10, 20));     //调用两个参数的方法
        System.out.println(add(10, 20, 30));      //调用三个参数的方法
        System.out.println(add(10, 20.5));       //调用四个参数的方法
    }

    public static int add(int a, int b) {
        return a + b;     //两个参数相加的方法
    }

    public static int add(int a, int b, int c) {
        return a + b + c;       //重载实现的参数个数不同
    }

    public static int add(int a, double b) {
        return (int) (a + b);     //重载后实现的参数类型不同
    }

    public static int add(double a, int b) {
        return (int) (a + b);     //重载后实现的参数多类型顺序不同
    }

//    public static int add(int x, int y) {     //错误，重载与参数名称无关
//        return x + y;
//    }

//    public static double add(int a, int b) {      //错误，重载与方法返回值类型无关
//        return a + b;     //两个参数相加的方法
//    }
}
