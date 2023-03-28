package Chapter09_静态.Demo_02_static关键字修饰成员方法;

//静态——static关键字修饰成员方法

/*
一旦使用static关键字修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类。

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它

无论是成员变量还是成员方法。如果有了static关键字修饰，都推荐使用类名称进行调用
    1.静态变量：类名称.静态变量
    2.静态方法：类名称.静态方法（）

注意事项：
    1.静态不能直接访问非静态，因为内存中是先有静态内容，后有非静态内容
    2.静态方法中不能使用 this 关键字
 */
public class Demo_02 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();    //首先创建对象
        obj.method();   //然后才能使用没有static关键字的内容

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称进行调用
        obj.methodStatic();     //通过对象名进行调用，这种方法在编译之后也会被javac翻译为 类名称.静态方法名
        MyClass.methodStatic();     //直接通过类名称进行调用
    }
}
