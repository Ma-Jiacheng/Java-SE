package Chapter12_多态.接口多态综合案例练习;

public class Laptop {

    public void powerOn(){
        System.out.println("笔记本电脑开机！");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机！");
    }

    //使用USB设备的方法，使用接口作为方法参数
    public void useDevice(USB usb){
        usb.open();     //打开设备

        //使用鼠标特有方法
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }

        //使用键盘特有方法
        if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }

        usb.close();    //关闭设备
    }
}
