package Chapter11_接口.Demo_05;

/*
接口当中也可以定义 “成员变量” ，但是必须使用 public、static、final 三个关键字修饰，从效果上看，其实就是接口的【常量】
    定义格式：
        public static final 数据类型 常量名称 = 数据值；
    注意：
        1.一旦使用 final 关键字进行修饰，说明不可改变
        2.接口中的常量，在书写时可以省略 public、static、final三个关键字，但仍然是存在的
        3.接口中的常量，必须进行赋值，不能为空
        4.不能再改变的常量，命名时需要使用大写字母，区别使用下划线加数组，例如：NUM_OF_1、NUM_OF_2
 */
public interface InterfaceConst {
    //这其实就是一个常量，一旦被赋值就不可修改
    public static final int NUM_OF_CLASS_CONST = 10;
}
