package Chapter13_内部类.Demo_02_权限修饰符.Sub;
import Chapter13_内部类.Demo_02_权限修饰符.Class;

public class StrangerClass {

    public void methodStranger(){
        //不同包非子类只能访问public
        System.out.println(new Class());
//        System.out.println(new Class().num2);
//        System.out.println(new Class().num3);
//        System.out.println(new Class().num4);
    }

}

