package Chapter07_API的概述和使用.Demo_08_ArrayList存储;

//ArrayList集合存储基本数据类型

/*
泛型只能是引用类型，不能是基本类型,集合存储的是数据地址值，基本数据类型没有地址

如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应 “包装类”

基本类型对应的包装类（包装类都位于java.long包中）：
    1.byte----Byte
    2.short----Short
    3.int----Integer 【特殊】
    4.long----Long
    5.float----Float
    6.double----Double
    7.char----Character 【特殊】
    8.boolean----Boolean

从 JDK 1.5+ 开始，支持自动装箱、自动拆箱
    自动装箱：基本类型 --> 包装类型
    自动拆箱：包装类型 --> 基本类型
 */

import java.util.ArrayList;

public class Demo_08 {
    public static void main(String[] args) {
        //引用类型
        ArrayList<String> listA = new ArrayList<>();

        //错误写法，泛型只能是引用类型，不能是基本类型
//        ArrayList<int> listB = new ArrayList<int>();

        //利用包装类
        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(21);
        listC.add(22);
        listC.add(23);
        int num = listC.get(2);
        System.out.println("从集合中获取的 int 型数据是："+num);
    }
}
