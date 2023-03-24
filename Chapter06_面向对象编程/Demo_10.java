package Chapter06_面向对象编程;

//定义一个标准类

/*
标准类的标准：
    1.所有的成员变量都需要使用 private 关键字进行修饰
    2.为每一个成员变量编写一对 getter 和 setter 方法
    3.编写一个无参数的构造方法
    4.编写一个全参数的构造方法
这样的标准类也叫做 Java Bean
 */
public class Demo_10 {
    private String name;
    private String age;
    private boolean male;

    //无参数构造方法
    public Demo_10() {

    }
    //全参数构造方法
    public Demo_10(String name, String age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }
    public void setMale(boolean male) {
        this.male = male;
    }
}
