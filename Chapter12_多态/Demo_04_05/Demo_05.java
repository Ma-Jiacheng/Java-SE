package Chapter12_多态.Demo_04_05;

//使用instanceof关键字进行类型判断

/*
如何才能知道一个父类引用的对象本来时什么子类？
    格式：
        对象 instanceof 类名称
    这将会得到一个boolean值结果，判断前面的对象能否当作后面类型的实例
 */
public class Demo_05 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        //如果需要调用子类特有方法，就需要进行向下转型

        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        else if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
