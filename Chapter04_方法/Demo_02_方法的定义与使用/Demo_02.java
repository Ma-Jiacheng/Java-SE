package Chapter04_方法.Demo_02_方法的定义与使用;

//方法的定义和调用

/*
方法的定义格式：
    public static void 方法名称(){
        方法主体;
    }

注意事项：
    1.方法的命名规则和变量一样，使用小驼峰式
    2.方法定义的先后顺序无所谓
    3.方法的定义不能产生嵌套包含关系
    4.方法定义后不会自动执行，想要执行必须在main方法中进行调用

调用方法的格式：
    方法名称();
 */
public class Demo_02 {
    public static void main(String[] args) {
        //延用Demo_15中的例子，用方法的格式来写

        //调用农民的方法
        farmer();
        //调用商贩的方法
        seller();
        //调用厨子的方法
        cook();
        //调用顾客的方法
        customer();

    }

    //农民的工作（方法）
    public static void farmer() {
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖给商贩");
    }

    //商贩的工作（方法）
    public static void seller() {
        System.out.println("运输到农贸市场");
        System.out.println("制定价格");
        System.out.println("售卖");
    }

    //厨师的工作（方法）
    public static void cook() {
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }

    //顾客的工作（方法）
    public static void customer() {
        System.out.println("享用");
    }
}
