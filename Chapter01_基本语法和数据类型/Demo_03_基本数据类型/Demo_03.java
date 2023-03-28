package Chapter01_基本语法和数据类型.Demo_03_基本数据类型;

//基本数据类型

/*
数据类型：
    基本数据类型： 整数型（byte、short、int、long）、浮点型（float、double）、字符型（char）、布尔型（boolean）
    引用数据类型：字符串、数组、类、接口、Lambda
注意事项：
    1.字符串不是基本数据类型，是引用数据类型
    2.浮点型可能只是一个近似值，而非精确值
    3.数据范围与字节数不一定相关，例如float数据范围比long更广范，但float是4字节而long是8字节
    4.浮点数中默认类型为double型，若要使用float型，则在后缀加 “F”
    5.整数中默认类型为int型，若要使用long型，则在后缀加 “L”
 */
public class Demo_03 {
    public static void main(String[] args) {
        //整数型
        System.out.println(100);    //默认为int型
        System.out.println(100L);    //更改为为long型
        //浮点数型
        System.out.println(3.14);    //默认为double型
        System.out.println(3.14F);    //更改为float型
    }
}

