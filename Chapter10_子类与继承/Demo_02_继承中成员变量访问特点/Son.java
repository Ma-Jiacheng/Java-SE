package Chapter10_子类与继承.Demo_02_继承中成员变量访问特点;

public class Son extends Father{
    int numS = 20;
    int num = 200;

    public void methodS(){
        //该方法使用本类中的 num 成员变量
        System.out.println(num);
    }
}
