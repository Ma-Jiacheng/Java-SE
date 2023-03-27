package Chapter13_内部类.Demo_03;

public class Outer {

    public class Inner {
        public void methodIn(){
            System.out.println("内部类的方法！");
            System.out.println("我叫:" + name);   //正确写法！内部类使用外部类可以随意访问
        }
    }

    private String name = "Mjc";

    public void methodOut(){
        System.out.println("外部类的方法！");
        //通过外部类方法间接访问内部类方法
        Inner inner = new Inner();
        inner.methodIn();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
