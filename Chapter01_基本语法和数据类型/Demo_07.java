package Chapter01_基本语法和数据类型;

//ASCII编码表

/*
字符和数字对应关系表（编码表）：
    ASCII码表：American Standard Code for Information Interchange,美国信息交换标准代码
    Unicode：万国码，0~127与ASCII码表完全一致，自128开始，包含更多字符
 */
public class Demo_07 {
    public static void main(String[] args) {
        char ch1 = '1';
        System.out.println(ch1 + 0);   //结果为49，显示字符‘1’对应的ASCII编码

        char ch2 = 'A';    //其实底层保存的为65

        char ch3 = 'c';
        int num1 = ch3;    //左侧为int，右侧为char，发生类型转换
        System.out.println(num1);   //结果为99，输出字符’c‘的ASCII编码

        char ch4 = '中';
        System.out.println(ch4 + 0);    //结果为20013
    }
}
