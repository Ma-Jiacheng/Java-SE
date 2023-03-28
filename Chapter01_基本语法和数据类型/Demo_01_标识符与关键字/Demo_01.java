package Chapter01_基本语法和数据类型.Demo_01_标识符与关键字;

//程序注释与Hello World说明
//关键字的概念与特征
//标识符的概念与命名规则

//单行注释

/*
    多
    行
    注
    释
 */

/*
关键字：Java中含有特殊含义的、被保留的、不能随意使用的字符（例：public、class、static、void）
关键字特点：
    1.完全由小写字母组成
    2.在IDEA、特殊记事本等文本编辑器中有特殊颜色

标识符：程序中自己定义的名称
命名规则：
    标识符可包含26个英文字母（区分大小写）、数字、美元符号（$）、下划线（_）
    标识符不能以数字开头
    标识符不能为关键字
命名规范：
    类名：首字母大写，其余小写（例：HelloWorld）
    方法名、变量名：首单词首字母小写，之后单词首字母大写，其余均小写（例：helloWorld）
 */
public class Demo_01 {
    public static void main(String[] args) {
        System.out.println("Hello World !");
    }
}

