package Chapter09_静态.Demo_01;

//静态——static关键字修饰成员变量

/*
如果一个成员变量使用了static关键字，那么这个变量不在属于对象自己，而是属于所在的类。多个对象共享同一份数据。
 */

public class Demo_01 {
    public static void main(String[] args) {
        Student one = new Student("路人甲", 19);
        one.room = "101教室";
        System.out.println("姓名：" + one.getName() + "，年龄：" + one.getAge() + "，教室：" + one.room + "，学号：" + one.getId());

        Student two = new Student("炮灰乙", 16);
        System.out.println("姓名：" + two.getName() + "，年龄：" + two.getAge() + "，教室：" + two.room + "，学号：" + two.getId());
    }
}
