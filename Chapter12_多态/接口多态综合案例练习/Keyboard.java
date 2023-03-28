package Chapter12_多态.接口多态综合案例练习;

public class Keyboard implements USB{

    @Override
    public void open() {
        System.out.println("打开键盘！");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘！");
    }

    public void type(){
        System.out.println("键盘输入！");
    }

}
