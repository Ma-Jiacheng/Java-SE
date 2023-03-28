package Chapter14_常用实用类.Demo_01_Object类的toString方法;

//Object类的 toString 方法

/*
java.lang.Object类：
    该是类层次的根类，每个类都使用Object类作为父类，所有对象（包括数组）都实现这个类的方法
 */
public class Demo_01 {
    public static void main(String[] args) {

        //Person类默认继承了Object类，所以可以使用Object类中的toString方法
        Person person = new Person("Mjc", 21);
        String message = person.toString();
        System.out.println(message);    //Chapter14_常用实用类.Demo_01.Person@4eec7777

        //直接打印对象的名字，其实就是调用对象的toString方法
        System.out.println(person);     //Chapter14_常用实用类.Demo_01.Person@4eec7777

        //再重写toString方法之后，以上两条信息会变为重写的打印输出 Person{name='Mjc', age=21}
    }
}
