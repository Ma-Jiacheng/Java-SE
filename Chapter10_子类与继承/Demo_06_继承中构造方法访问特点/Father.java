package Chapter10_子类与继承.Demo_06_继承中构造方法访问特点;

public class Father {

    public Father(){
        System.out.println("父类无参构造方法！");
    }

    public Father(int num){
        System.out.println("父类有参构造方法！");
    }
}
