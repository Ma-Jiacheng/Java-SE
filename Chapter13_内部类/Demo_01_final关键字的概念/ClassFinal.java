package Chapter13_内部类.Demo_01_final关键字的概念;

/*
用final关键字来修饰一个类的时候，格式：
    public final class 类名称{
        ......
    }
含义：当前这个类不能有任何的子类
注意：一个类如果是final的，其中所有的成员方法都无法进行覆盖重写
 */
public final class ClassFinal {

    public void method(){
        System.out.println("方法执行！");
    }

}
