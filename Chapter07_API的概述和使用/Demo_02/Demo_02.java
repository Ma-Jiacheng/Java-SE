package Chapter07_API的概述和使用.Demo_02;

//匿名对象

/*
创建对象的标准格式：
    类名称 对象名 = new 类名称()

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
    格式： new 类名称()

匿名对象只能使用唯一的一次，下次使用不得不再创建一个新对象

使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象
 */

public class Demo_02 {
    public static void main(String[] args) {
        //左边的 one 即为对象名称
        Person one = new Person();
        one.name = "Mjc";
        one.showName();

        //匿名对象
        new Person().name = "Jac";
        new Person().showName();    //结果为 null，“Jac”的值赋给了 new Person().name，new Person().showName()为新创建对象，没有被赋值
    }
}
