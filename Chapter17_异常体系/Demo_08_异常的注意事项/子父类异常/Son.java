package Chapter17_异常体系.Demo_08_异常的注意事项.子父类异常;

public class Son extends Father{
    //子类重写父类方法时，抛出和父类相同的异常
    @Override
    public void method01() throws NullPointerException, ClassCastException{}

    //子类重写父类方法时，抛出父类异常的子类
    @Override
    public void method02() throws ArrayIndexOutOfBoundsException{}

    //子类重写父类方法时，不抛出异常
    @Override
    public void method03(){}
}
