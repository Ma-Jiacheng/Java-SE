package Chapter12_多态.Demo_03_多态中成员方法的使用特点;

//多态中成员方法的使用特点

/*
在多态中，成员方法的访问规则是：
    看 new 后创建的是谁，就优先使用谁的方法，没有则向上查找
 */
public class Demo_03 {
    public static void main(String[] args) {
        Father obj = new Son();
        obj.method();   //父类与子类都有method方法，因为new后面为子类，所以优先使用子类方法！
        obj.methodF();  //子类没有该父类方法，所以向上查找，使用父类的方法！
    }
}
