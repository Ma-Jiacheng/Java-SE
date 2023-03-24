package Chapter06_面向对象编程.Demo_03_04;

//手机类运行

public class Demo_03 {
    public static void main(String[] args) {
        // 1.导包：需要使用的类与当前执行的类在同一包内，省略

        // 2.创建
        Phone phone = new Phone();

        // 3.使用
        phone.brand = "华为";
        phone.price = 2799;
        phone.color = "玫瑰金";
        System.out.println("手机信息:");
        System.out.println("品牌：" + phone.brand);
        System.out.println("价格：" + phone.price);
        System.out.println("颜色：" + phone.color);

        System.out.println("-------------------");

        phone.call("马家成");
        phone.sendMessage("马家成", "你好！");
    }
}
