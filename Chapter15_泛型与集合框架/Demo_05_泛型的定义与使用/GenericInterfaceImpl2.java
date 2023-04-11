package Chapter15_泛型与集合框架.Demo_05_泛型的定义与使用;

public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void method(I i){
        System.out.println(i);
    }
}
