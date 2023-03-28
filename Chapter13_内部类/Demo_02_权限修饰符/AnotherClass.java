package Chapter13_内部类.Demo_02_权限修饰符;

public class AnotherClass {

    public void anotherMethod(){
        System.out.println(new Class().num1);
        System.out.println(new Class().num2);
        System.out.println(new Class().num3);
//        System.out.println(new MyClass().num4);     //同包不同类不能访问private
    }

}
