package Chapter13_内部类.Demo_09_10;
import java.util.ArrayList;
import java.util.List;


/*
Java.util.List正是ArrayLit所实现的接口
 */
public class Demo_10 {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        System.out.println(result);
    }

    public static List<String> addNames(List<String> list){
        list.add("Mjc");
        return list;
    }

}
