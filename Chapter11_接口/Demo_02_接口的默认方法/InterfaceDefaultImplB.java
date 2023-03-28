package Chapter11_接口.Demo_02_接口的默认方法;

public class InterfaceDefaultImplB implements InterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，B！");
    }

    public void methodDefault(){
        System.out.println("B重写了接口的默认方法！");
    }
}