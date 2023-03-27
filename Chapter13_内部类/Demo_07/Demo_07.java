package Chapter13_内部类.Demo_07;

//匿名内部类

/*
如果接口的实现类（或者父类的子类），只需要使用唯一的一次，那么这种情况下就可以省略掉该类的定义，改为使用匿名内部类

匿名内部类的定义格式：
    接口名称 对象名 = new 接口名称() {
        覆盖重写接口中所有抽象方法
    }

对 ”new 接口名称() {......};“ 进行解析：
    1.new代表创建对象的动作
    2.接口名称就是匿名内部类需要实现哪个接口
    3.{......}匿名内部类的内容

匿名内部类注意事项：
    1.匿名内部类在创建对象时只能使用唯一一次，如果希望多次创建对象，必须使用单独定义的实现类
    2.匿名对象在调用方法时只能使用唯一一次，如果希望调用多次，必须为对象命名
    3.匿名内部类是省略了实现类（或子类），匿名对象是省略了对象名称
    4.匿名内部类和匿名对象不是一回事
 */

public class Demo_07 {
    public static void main(String[] args) {
        //普通方式
//        Interface obj = new InterfaceImpl();
//        obj.method();

        //匿名内部类方式
        Interface obj = new Interface() {
            @Override
            public void method() {
                System.out.println("匿名内部类覆盖重写接口抽象方法！-A");
            }
        };
        obj.method();

        System.out.println("====================");

        //匿名对象只能使用一次
        new Interface(){
            @Override
            public void method() {
                System.out.println("匿名内部类覆盖重写接口抽象方法！-B");
            }
        }.method();
    }
}
