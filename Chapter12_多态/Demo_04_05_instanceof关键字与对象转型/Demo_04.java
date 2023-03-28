package Chapter12_多态.Demo_04_05_instanceof关键字与对象转型;

//对象的向上（下）转型

public class Demo_04 {
    public static void main(String[] args) {
        //对象的向上转型，就是父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();   //猫吃鱼
//        animal.catchMouse();    //错误写法！对象一旦向上转型为父类，就无法调用子类原本拥有的特有方法

        //正确向下转型，进行 “还原” 操作
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //错误向下转型
        Dog dog = (Dog) animal;     //new创建的为Cat，还原为Dog，编译不会报错，但是运行会出现类转换异常！
    }
}
