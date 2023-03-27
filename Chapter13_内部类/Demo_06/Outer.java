package Chapter13_内部类.Demo_06;

//局部内部类的final问题

/*
局部内部类，如果需要访问所在方法的局部变量，那么这个局部变量必须是【有效final的】
原因：
    1.new出来的对象在堆内存中
    2.局部变量是跟着方法走的，在栈内存中
    3.方法运行结束之后，立刻出栈，局部变量就会立刻消失
    4.new出来的对象会在堆中持续存在，直到垃圾回收为止

备注：从 Java 8+ 开始，局部内部类只要final事实不变，final关键字可以省略
 */
public class Outer {
    public void methodOuter(){
        final int num = 10;   //所在方法的局部变量

        class Inner{
            public void methodInner(){
                System.out.println(num);
            }
        }

    }
}
