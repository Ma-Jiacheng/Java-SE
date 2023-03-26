package Chapter12_多态.Demo_02;

//多态中成员变量的使用特点

/*
访问成员变量的两种方式：
    1.直接通过对象名访问：看等号左边是谁就优先用谁，没有则向上查找
    2.间接通过成员方法访问：该方法属于谁就优先用谁的成员变量
 */
public class Demo_02 {
    public static void main(String[] args) {
        //使用多态写法
        Father obj = new Son();

        System.out.println(obj.num);   //10，优先使用等号左边的类的成员变量值

        System.out.println("===================");

        obj.showNum();    //如果子类没有覆盖重写则为 10，父类的方法，优先使用父类的成员变量
                          //如果子类进行该方法的覆盖重写则为20，使用子类成员变量
    }
}
