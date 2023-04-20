package Chapter17_异常体系.Demo_08_异常的注意事项.finally含有return语句;

/*
异常的注意事项——finally含有return语句：
    finally中含有return语句，finally是一定会执行的代码块，所以永远都是返回finally中的结果，这种情况必须要避免
 */
public class Demo_08 {
    public static void main(String[] args) {
        int num = getNum();
        System.out.println(num);
    }

    public static int getNum(){
        int num = 10;
        try{
            return num;
        } catch (Exception e){
            System.out.println(e);
        } finally {     //finally代码块一定会执行，永远返回finally中的结果，所以避免在finally中书写return语句
            num = 20;
            return num;
        }
    }

}
