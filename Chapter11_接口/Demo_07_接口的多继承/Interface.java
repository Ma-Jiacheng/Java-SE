package Chapter11_接口.Demo_07_接口的多继承;

/*
这个子接口中有四个方法：
    1.methodA：来源于接口A
    2.methodB：来源于接口B
    3.methodCommon：来源于接口A和B
    4.method：来源于自身

注意事项：
    1.多个父接口中的抽象方法重复可以忽略
    2.多个父接口中的默认没方法重复，那么子接口必须进行默认方法的覆盖重写，并且任然是Default的
 */
public interface Interface extends InterfaceA, InterfaceB{

    public abstract void method();

    @Override
    default void methodRepeat() {
        System.out.println("重写父接口中重复的默认方法！");
    }
}
