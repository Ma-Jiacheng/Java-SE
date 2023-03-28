package Chapter10_子类与继承.Demo_08_抽象方法与抽象类;

public class Demo_08 {
    public static void main(String[] args) {
//        Animal animal = new Animal();   //错误写法！不能直接创建抽象类对象！
        Cat cat = new Cat();
        cat.eat();
    }
}
