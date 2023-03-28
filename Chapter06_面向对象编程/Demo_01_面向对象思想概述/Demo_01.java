package Chapter06_面向对象编程.Demo_01_面向对象思想概述;

//面向对象思想概述

/*
面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲历亲为，详细处理每一个细节————强调步骤
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人帮忙进行————强调对象

面向对象的特点：
    面向对象的思想是一种更符合我们思考习惯的思想，它可以将复杂的事情简单化，并将我们从执行者变成了指挥者。
    面向对象的语言中，包含了三大基本特征，即封装、继承和多态
 */

import java.util.Arrays;

public class Demo_01 {
    public static void main(String[] args) {
        //以打印数组数据为例,要求格式为[10， 20， 30， 40， 50]
        int[] array = {10, 20, 30, 40, 50};

        //使用面向过程，每一个步骤都要亲自进行
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {     //如果是最后一个数
                System.out.println(array[i] + "]");
            } else {   //不是最后一个数
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println("--------------------");

        //使用面向对象,寻找JDK提供的类，帮助实现该功能
        System.out.println(Arrays.toString(array));
    }
}
