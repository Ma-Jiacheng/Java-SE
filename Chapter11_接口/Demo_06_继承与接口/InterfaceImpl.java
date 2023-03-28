package Chapter11_接口.Demo_06_继承与接口;

public class InterfaceImpl implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("覆盖重写A方法！");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写B方法！");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了A和B的Abs方法！");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口中的默认方法进行覆盖重写！");
    }
}
