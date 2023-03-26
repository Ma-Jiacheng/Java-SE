package Chapter12_多态.Demo_01;

//多态的格式及使用

/*
代码当中体现多态性：父类引用指向子类对象
    格式：
        父类名称 对象名 = new 子类名称（）；
        接口名称 对象名 = new 实现类名称（）；
 */
public class Demo_01 {
    public static void main(String[] args) {
        //使用多态的方法
        Father obj = new Son();     //左侧父类引用指向右侧子类的对象
        obj.method();   //new 的是谁就使用谁的方法
        obj.methodUnique();     //子类可以被当作父类，使用父类特有的方法，体现多态性
    }
}
