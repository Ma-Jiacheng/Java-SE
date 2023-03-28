package Chapter08_字符串.Demo_05_字符串截取;

//字符串常用方法——字符串截取

/*
字符串截取方法：
    1. public String substring(int index)：从参数位置开始，直到末尾截取字符串
    2. public String substring(int begin, int end)：截取从参数 begin 开始到 end 结束的字符串，注意 [begin, end)
 */
public class Demo_05 {
    public static void main(String[] args) {
        String str1 = "HelloWorld";

        String str2 = str1.substring(5);
        System.out.println("截取的字符串内容为：" + str2);

        String str3 = str1.substring(2,6);
        System.out.println("截取的字符串内容为：" + str3);
    }
}
