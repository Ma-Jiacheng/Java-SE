package Chapter15_泛型与集合框架.Demo_05_泛型的定义与使用;

/*
定义含有泛型的接口

含有泛型的接口使用方式：
    1.定义接口的实现类，实现接口，指定接口的泛型
        public interface Iterator<E>{
            ......
        }
    2.接口使用什么泛型，实现类就使用什么泛型，类跟接口保持一致，相当于定义了一个含有泛型的类，创建对象的时候确定泛型数据类型.
 */
public interface GenericInterface<I> {
    public abstract void method(I i);
}
