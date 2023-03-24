package Chapter06_面向对象编程.Demo_03_04;

//练习————定义一个类，模拟 “手机” 事物

/*
手机类：
    成员变量（属性）：
        String brand    //品牌
        int price   //价格
        String color    //颜色
    成员方法（行为）：
        public void call() {}   //打电话
        public void sendMessage() {}    //发短信
 */
public class Phone {
    //成员变量
    String brand;    //品牌
    int price;   //价格
    String color;    //颜色

    //成员方法
    public void call(String who){
        System.out.println("正在给"+who+"打电话");
    }

    public void sendMessage(String who,String message) {
        System.out.println("正在给"+who+"发送消息："+message);
    }
}
