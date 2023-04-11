package Chapter15_泛型与集合框架.Demo_09_哈希值;

import javax.crypto.spec.PSource;

/*
哈希值；
    是一个十进制整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，通过模拟得到的，不是数据实际存储的物理地址）

在Object类中有一个方法，可以获取对象的哈希值
    int HashCode()：返回该对象的哈希值
注意：该方法可以被重写，返回任意值
 */
public class Demo_09 {
    public static void main(String[] args) {
        //创建一个Person类的对象，Person类继承了Object类
        Person person = new Person();
        //获取person的哈希值
        int hashcode = person.hashCode();
        System.out.println(hashcode);
    }
}
