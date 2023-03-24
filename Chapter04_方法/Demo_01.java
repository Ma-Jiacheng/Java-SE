package Chapter04_方法;

//方法的概念

/*
什么是方法？
    将一个功能抽取出来，把代码单独定义在一个大括号内，形成一个单独的功能
 */
public class Demo_01 {
    public static void main(String[] args) {
        //以餐厅吃饭为例，可以根据不同的角色将整个过程拆分为多个部分，每个部分可以写成一个方法

        //农民的工作
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖给商贩");

        //商贩的工作
        System.out.println("运输到农贸市场");
        System.out.println("制定价格");
        System.out.println("售卖");

        //厨师的工作
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");

        //顾客的工作
        System.out.println("享用");
    }
}
