package Chapter15_泛型与集合框架.Demo_05_泛型的定义与使用;

/*
定义一个含有泛型的类，模拟ArrayList集合
 */
public class GenericClass<E> {

    private String name;

    private E names;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E getNames() {
        return names;
    }

    public void setNames(E names) {
        this.names = names;
    }
}

