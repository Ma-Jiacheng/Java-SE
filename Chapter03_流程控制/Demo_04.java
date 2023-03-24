package Chapter03_流程控制;

//循环语句

/*
循环结构的基本组成部分：
    1.初始化语句：在循环开始的最初执行，而且只执行一次
    2.条件判断：若条件成立，则循环继续，若不成立，则循环退出
    3.循环体：需要重复执行的事情内容，若干行语句
    4.步进语句：循环执行之后的扫尾工作

循环语句包括：for循环、while循环、do-while循环

for循环定义格式：
    for(初始化表达式1 ； 布尔表达式2 ； 步进表达式3){
            循环体；
       }

while循环定义格式：
    初始化语句;
    while(条件判断){
        循环体;
        步进语句;
    }

do-while循环定义格式：
    do{
        循环体;
        步进语句
    }while(条件判断)
先无条件执行一次循环体，然后进行条件判断，若满足则再执行一次，然后再进行判断

 */
public class Demo_04 {
    public static void main(String[] args) {
        //for循环
        for (int i = 0; i < 10; i++) {
            System.out.println("我错了" + i);
        }

        //while循环
        int j = 0;
        while (j < 10) {
            System.out.println("我没错" + j);
            j++;
        }
        //do-while循环
        int k = 1;
        do {
            System.out.println("是你错了" + k);
            k++;
        } while (k < 10);

    }
}
