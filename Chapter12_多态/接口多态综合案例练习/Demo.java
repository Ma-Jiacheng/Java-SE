package Chapter12_多态.接口多态综合案例练习;

public class Demo {
    public static void main(String[] args) {
        //创建一个笔记本电脑
        Laptop laptop = new Laptop();

        //笔记本电脑开机
        laptop.powerOn();

        //准备一个鼠标供笔记本使用
        USB usbMouse = new Mouse();  //进行向上转型，将鼠标当作一个USB设备
        laptop.useDevice(usbMouse);  //参数为USB类型

        //创建一个键盘
        Keyboard keyboard = new Keyboard();     //没有使用多态写法
        laptop.useDevice(keyboard);     //正确写法，方法参数是USB类型，传递进去的是实现类对象，也发生了向上转型

        //笔记本电脑关机
        laptop.powerOff();
    }
}
