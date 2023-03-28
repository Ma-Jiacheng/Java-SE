package Chapter11_接口.Demo_04_接口的私有方法;

public class InterfacePrivateAImpl implements InterfacePrivateA {

    public void methodAnother(){
        //直接访问到了接口中的默认方法
//        methodCommon();     //是错误的！Common是为了解决接口内部的问题，不该被实现类访问
    }
}
