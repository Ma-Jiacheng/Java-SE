package Chapter12_多态.Demo_01;

import Chapter12_多态.Demo_01.Father;

public class Son extends Father {

    @Override
    public void method(){
        System.out.println("子类方法！");
    }

}
