package Chapter03_流程控制;

// 三种循环的区别
//break语句和continue语句
//死循环和循环嵌套

/*
三种循环的区别：
    1.如果条件判断从未被满足过，for循环和while循环都从不执行，do-while循环会执行一次
    2.for循环变量i通常为定义在括号内的局部变量，只能在for循环内使用

break语句常见用法：
    1.用在switch语句中，一旦被执行，立即结束switch语句
    2.用在循环结构中，一旦被执行，立刻结束循环，循环被打断

循环方案的选择：凡是次数确定的场景通常使用for循环，否则使用while循环，do-while循环很少使用

continue语句：一旦执行，立刻跳过当前循环剩余内容，马上开始下一次循环

死循环：永远停不下来的循环
死循环的书写格式：
    while(true){
        循环体;
    }
注意：死循环之后不能编写任何语句，不会被执行，会产生错误

循环嵌套：在外层循环内再次嵌套一层内循环
格式：以for循环为例
    for(int i = 0;i < 10;i++){
        for(int j = 0;j < 10;j++{
            循环体;
        }
    }
 */
public class Demo_05 {
    public static void main(String[] args) {
        //循环条件从未被满足
        for (int i = 1; i < 0; i++) {
            System.out.println("for循环测试语句");    //不会执行
        }

        int i = 1;
        while (i < 0) {
            System.out.println("while循环测试语句");  //不会执行
        }

        int j = 1;
        do {
            System.out.println("do-while循环测试语句");   //先执行一次
            j++;
        } while (j < 0);

        //break语句终止循环
        for (int k = 0; i < 10; k++) {
            System.out.println("循环打断测试语句" + k);
            if (k == 5) {
                break;      //循环执行到第六次时中断
            }
        }

        //continue语句跳过循环
        for (int x = 1; x < 10; x++) {
            if (x == 4) {
                continue;      //跳过第五次循环
            }
            System.out.println("continue跳过循环测试" + x);
        }

        //循环嵌套打印矩形
        for (int y = 0; y < 10; y++) {
            for (int z = 0; z < 10; z++) {
                System.out.print("?");
            }
            System.out.print("\n");
        }

    }
}
