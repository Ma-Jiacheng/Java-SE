package Chapter06_面向对象编程.Demo_08_09;

//构造方法

/*
构造方法是专门用来创建对象的方法，当我们通过关键字 new 创建对象时，其实就是调用构造方法
    格式：
        public 类名称（参数类型 参数名，...）{
            方法体
        }
注意事项：
    1.构造方法的名称必须和所在的类名称完全相同，大小写也要一样
    2.构造方法不需要写返回值类型，连 void 关键字也不用写
    3.构造方法不能 return 一个具体的返回值
    4.如果没有编写任何构造方法，编译器会默认构造一个，没有参数、方法，什么都不做
    5.一旦编写了至少一个构造方法，编译器将不在进行默认构造
    6.构造方法也可以进行重载
 */
public class Student {
    String name;
    int age;

    public Student(){
        System.out.println("构造方法执行！");
    }
    //构造方法重载
    public Student(String name,int age){
        System.out.println("重载构造方法执行！");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
