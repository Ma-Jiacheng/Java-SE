package Chapter13_内部类.Demo_01_final关键字的概念;

public class Son extends Father{
    @Override
    public void method() {
        System.out.println("子类覆盖重写父类的方法！");
    }

    //错误写法，final修饰的方法不能被重写
//   @Override
//    public void methodFinal(){
//        System.out.println("子类覆盖重写父类final方法！");
//    }
}
