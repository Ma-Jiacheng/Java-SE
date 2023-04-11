package Chapter15_泛型与集合框架.Demo_05_泛型的定义与使用;

public class GenericInterfaceImpl1 implements GenericInterface<String>{
    @Override
    public void method(String str){
        System.out.println(str);
    }
}
