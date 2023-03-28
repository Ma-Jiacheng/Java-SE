package Chapter06_面向对象编程.Demo_03_04_对象类型作为方法参数;

//使用对象类型作为方法的参数
//使用对象类型作为方法的返回值

/*

 */

public class Demo_04 {
    public static void main(String[] args) {
        //对象类型作为方法参数
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8848;
        one.color = "银灰色";
        method(one);

        System.out.println("-------------------");

        //对象类型作为方法返回值
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static void method(Phone parma) {     //使用对象类型作为方法的参数
        System.out.println(parma.brand);
        System.out.println(parma.price);
        System.out.println(parma.color);
    }

    public static Phone getPhone() {     //使用对象类型作为方法的返回值
        Phone two = new Phone();
        two.brand = "华为";
        two.price = 3999;
        two.color = "玫瑰金";

        return two;
    }
}
