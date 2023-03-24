package Chapter06_面向对象编程.Demo_08_09;

public class Demo_09 {
    public static void main(String[] args) {

        Student student1 = new Student();    //使用 new 关键字创建对象，其实就是调用构造方法

        Student student2 = new Student("马家成",21);   //有参构造可以通过 this 关键字直接赋值给成员变量

        System.out.println("姓名："+student2.getName()+","+"年龄："+student2.getAge());

        //改变数据仍然需要使用set方法
        student2.setAge(22);
        System.out.println("姓名："+student2.getName()+","+"年龄："+student2.getAge());
    }
}
