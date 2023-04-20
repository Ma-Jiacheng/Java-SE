package Chapter17_异常体系.Demo_09_自定义异常;

/*
自定义异常类：
    定义格式：
        public class ***Exception extends Exception/RuntimeException{
            空参数构造方法;
            带异常信息的构造方法;
        }
    注意事项：
        1.自定义异常类一般是***Exception，说明该类是一个异常类
        2.自定义异常类必须继承Exception或RuntimeException
            继承Exception：自定义异常类为编译期异常，方法内部抛出后就必须处理
            继承RuntimeException：自定义异常为运行期异常，无需处理

 */
public class RegisterException extends Exception{
    //空参数构造方法
    public RegisterException(){

    }

    //带异常信息的构造方法
    //方法内部调用父类带异常信息的构造方法，让父类处理这个异常信息
    public RegisterException(String message){
        super(message);
    }
}
