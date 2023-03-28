package Chapter01_基本语法和数据类型.Demo_02_常量的概念与分类;

//常量的概念与分类
//常量的打印输出

/*
常量：在程序运行期间不变的量
常量的分类：
    字符串常量：用 ” “ 包括的字符串，可为空串（例：”HelloWorld“ 、 ”abcd“）
    字符常量：用 ‘ ’ 包括的单个字符（例：‘A’、‘b’、‘中’、‘7’、‘+’）
    整数常量：直接书写的整数（例：100、888、0、-250）
    浮点数常量：直接书写的小数（例：2.5、-3.14、0.921）
    布尔常量：只有两种取值 true、false
    空常量：没有任何数据 null
 */
public class Demo_02 {
    public static void main(String[] args) {
        //字符串常量
        System.out.println("Hello World");
        System.out.println("你好，世界");
        //字符常量
        System.out.println("A");
        System.out.println("中");
        //整数常量
        System.out.println(100);
        System.out.println(-250);
        //浮点数常量
        System.out.println(3.14);
        System.out.println(-0.921);
        //布尔常量
        System.out.println(true);
        System.out.println(false);
        //空常量不能直接用来打印输出
    }
}

