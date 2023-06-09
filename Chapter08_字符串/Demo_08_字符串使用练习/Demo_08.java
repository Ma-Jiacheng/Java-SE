package Chapter08_字符串.Demo_08_字符串使用练习;


//字符串练习

/*
题目：
    定义一个方法，把数组 {1, 2, 3} 按照指定格式拼接成为一个字符串。格式参照如下 [word1#word2#word3]
分析：
    1.首先准备一个 int 数组，内容为 1、2、3
    2.定义一个方法，将数组内容按格式转换为字符串
        返回值类型：String
        方法名称：fromArrayToString
        参数列表；int[]
    3.格式：[word1#word2#word3]
    4.用到的内容：for循环、字符串拼接、元素之前增加word字样、分隔使用#、判断是否为最后一个字符
 */

public class Demo_08 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                str += "word" + array[i] + "]";
            }
            else{
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }

}
