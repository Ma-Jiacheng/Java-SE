package Chapter13_内部类.Demo_08_类作为成员变量类型;

public class Weapon {

    private String code;    //武器代称

    public Weapon(){

    }

    public Weapon(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
