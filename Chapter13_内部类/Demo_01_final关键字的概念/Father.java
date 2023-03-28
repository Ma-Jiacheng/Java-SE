package Chapter13_内部类.Demo_01_final关键字的概念;

/*
当final关键字用来修饰一个方法的时候，这个方法就是最终的方法，不可被覆盖重写
    格式：
        修饰符 final 返回值类型 方法名称（参数列表）{
            方法体；
        }
注意事项：对于类、方法来说，abstract关键字和final关键字不能同时使用，会产生矛盾
 */
public class Father {
    //普通方法
    public void method(){
        System.out.println("父类方法执行！");
    }

    //final方法
    public final void methodFinal(){
        System.out.println("父类的final方法执行！");
    }

}
