package Chapter10_子类与继承.Demo_05_方法的覆盖重写;

//定义一个新款手机，使用老款手机作为父类
public class NewPhone extends Phone {
    @Override
    public void show(){
        super.show();   //直接使用父类的show方法

        //添加子类新增的方法
        System.out.println("显示姓名！");
        System.out.println("显示头像！");
    }
}