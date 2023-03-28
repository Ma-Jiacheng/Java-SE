package Chapter14_常用实用类.Demo_02_Object类的equals方法;

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

    /*
    Object类的equals方法，对引用类型默认比较两个对象的地址值，如果需要比较属性值，也需要进行重写
    问题：存在一个多态，无法使用子类特有的内容（属性、方法）
            Object obj = person1/person2 = new Person("路人甲", 21)/new Person("过客乙", 22)
    解决：使用向下转型，将Object转换为Person
     */
    @Override
    public boolean equals(Object obj) {
        //判断比较的两个对象是否是同一个
        if (obj == this) {
            return true;
        }
        //防止出现类型转换错误，增加判断
        if (obj instanceof Person) {
            //使用向下转型，把Object类型转换为Person
            Person person = (Person) obj;
            //比较两个对象的属性
            boolean result = this.name.equals(person.name) && this.age == person.age;
            return result;
        }
        return false;
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
