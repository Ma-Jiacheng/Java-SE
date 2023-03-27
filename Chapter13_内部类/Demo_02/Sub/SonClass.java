package Chapter13_内部类.Demo_02.Sub;
import Chapter13_内部类.Demo_02.Class;

public class SonClass extends Class{

    public void methodSon(){
        System.out.println(super.num1);
        System.out.println(super.num2);
//        System.out.println(super.num3);     //不同包子类不能访问default
//        System.out.println(super.num4);     //不同包子类不能访问private
    }
}
