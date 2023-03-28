package Chapter10_子类与继承.Demo_03_重名变量解决方法;

//区分子类方法中三种重名的变量（父类、子类、子类方法）

/*
局部变量：直接编写
本类的成员变量：this.成员变量名
父类的成员变量：super. 成员你变量名
 */

public class Demo_03 {
    public static void main(String[] args) {
        Son son = new Son();
        son.method();
    }
}
