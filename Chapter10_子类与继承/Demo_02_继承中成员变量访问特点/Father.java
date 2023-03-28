package Chapter10_子类与继承.Demo_02_继承中成员变量访问特点;

public class Father {
    int numF = 10;
    int num = 100;

    public void methodF(){
        //该方法使用本类中的 num 成员变量
        System.out.println(num);
    }
}
