package Chapter10_子类与继承.Demo_03;

public class Son extends Father{
    int num = 20;

    public void method(){
        int num = 30;

        System.out.println(num);    //30，局部变量
        System.out.println(this.num);   //20，本类中的成员变量
        System.out.println(super.num);  //10，使用 super 关键字访问父类中的成员变量
    }
}
