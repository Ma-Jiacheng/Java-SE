package Chapter11_接口.Demo_03_接口的静态方法;

/*
从 Java 8 开始，接口当中允许定义静态方法
    格式：
        public static 返回值类型 方法名称（参数列表）{
            方法体；
        }
 */
public interface InterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是接口的静态方法！");
    }
}
