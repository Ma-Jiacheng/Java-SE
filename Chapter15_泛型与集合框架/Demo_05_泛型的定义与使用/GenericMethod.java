package Chapter15_泛型与集合框架.Demo_05_泛型的定义与使用;

/*
定义含有泛型的方法，泛型定义在方法的修饰符和返回值之间
    格式：
        修饰符 <泛型> 返回值类型 方法名称(参数列表（使用泛型）){
            ......
        }
含有泛型的方法，在调用方法的时候确定泛型的数据类型，传递什么类型的参数，泛型就是什么类型
 */
public class GenericMethod {
    //普通方法
    public <M> void method(M m){
        System.out.println(m);
    }
    //静态方法
    public static <S> void methodStatic(S s){
        System.out.println(s);
    }
}
