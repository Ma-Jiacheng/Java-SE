package Chapter12_多态.Demo_04_05_instanceof关键字与对象转型;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠！");
    }
}
