package Chapter17_异常体系.Demo_08_异常的注意事项.子父类异常;

public class Father {
    public void method01() throws NullPointerException, ClassCastException{}

    public void method02() throws IndexOutOfBoundsException{}

    public void method03() throws IndexOutOfBoundsException{}

    public void method04(){}
}
