package Chapter17_异常体系.Demo_08_异常的注意事项.子父类异常;

/*
异常的注意事项——子父类异常：
    1.如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常、父类异常的子类、不抛出异常
    2.父类方法没有抛出异常，子类重写父类方法时也不可抛出异常。如果子类方法产生异常，只能捕获处理
 */
public class Demo_08 {
    public static void main(String[] args) {
        //父类未抛出异常，子类出现异常只能捕获处理，不能抛出
        Son son = new Son();
        son.method04();
    }
}
