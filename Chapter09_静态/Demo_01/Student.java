package Chapter09_静态.Demo_01;

public class Student {
    private String name;
    private int age;
    static String room;

    private int id;
    private static int idCounter = 0;   //学号计数器，每当创建一个新对象，id号++

    public Student(){
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
