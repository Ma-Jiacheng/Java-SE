package Chapter12_多态.Demo_04_05_instanceof关键字与对象转型;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉！");
    }

    public void watchHouse() {
        System.out.println("狗看家！");
    }
}
