package Chapter13_内部类.Demo_04;

public class Demo_04 {
    public static void main(String[] args) {
        //创建内部类对象
        Outer.Inner inner = new Outer().new Inner();

        inner.methodInner();
    }
}
