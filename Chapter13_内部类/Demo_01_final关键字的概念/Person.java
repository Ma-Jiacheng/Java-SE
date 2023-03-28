package Chapter13_内部类.Demo_01_final关键字的概念;

/*
对于成员变量来说，如果使用final关键字修饰就不可改变

1.由于成员变量具有默认值，所以用了final关键字修饰必须手动赋值
2.对于final的成员变量，要么直接赋值，要么使用构造方法赋值
3.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值
 */
public class Person {

//    public String name;

//    public final String name;     //错误写法！必须手动赋值

    public final String name/* = "Mjc"*/;   //如果使用直接赋值，就不能在构造方法中在进行赋值！

    public  Person(){   //在构造方法中进行赋值，则不能使用直接赋值
        name = "Mjc";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
