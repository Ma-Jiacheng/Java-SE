package Chapter11_接口.Demo_06_继承与接口;

//继承父类并实现多个接口

/*
使用接口的时候，需要注意：
    1.接口是没有静态代码块或构造方法的
    2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
        格式：
            public class InterfaceImpl implement InterfaceA, InterfaceB{
                覆盖重写所有抽象方法
            }
    3.如果实现类实现的多个接口中存在重复的多个方法，只需要覆盖重写一次
    4.如果实现类没有覆盖重写所有接口中的所有抽象方法，那么实现类必须是抽象的
    5.如果实现类所实现的多个接口中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写
    6.一个类如果直接父类当中的方法和接口当中的默认方法产生冲突，那么会优先使用父类中的方法
 */
public class Demo_06 {
    public static void main(String[] args) {
        //一个类如果直接父类当中的方法和接口当中的默认方法产生冲突，那么会优先使用父类中的方法
        Son son = new Son();
        son.method();   //优先使用父类的方法！
    }
}
