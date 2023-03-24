package Chapter07_API的概述和使用.Demo_05;

//对象数组

/*
目标：定义一个数组，用来存储三个Person对象
 */

public class Demo_05 {
    public static void main(String[] args) {
        //首先创建一个长度为 3 的数组，里面用来存放 Person 类型的对象
        Person[] array = new Person[3];

        //创建三个对象
        Person one = new Person("路人甲",21);
        Person two = new Person("过客乙",22);
        Person three = new Person("炮灰丁",23);

        //将对象中的地址值赋值到数组对应元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[0]);   //地址值
        System.out.println(array[1]);   //地址值
        System.out.println(array[2]);   //地址值

        System.out.println(array[0].getName());
        System.out.println(array[0].getAge());
    }
}
