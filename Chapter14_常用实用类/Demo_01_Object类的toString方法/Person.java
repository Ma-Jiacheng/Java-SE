package Chapter14_常用实用类.Demo_01_Object类的toString方法;

public class Person {

    private String name;
    private int age;

    public Person() {

    }

    //直接打印对象的地址值通常是没有意义的，所以需要重写Object类的toString方法来实打印对象的属性
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
