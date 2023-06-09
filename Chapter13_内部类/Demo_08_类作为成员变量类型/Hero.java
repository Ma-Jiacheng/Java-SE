package Chapter13_内部类.Demo_08_类作为成员变量类型;

public class Hero {

    private String name;
    private int age;
    private Weapon weapon;

    public void attack(){
        System.out.println("年龄为" + age + "的" + name + "使用" + weapon.getCode() + "攻击了你！");
    }

    public Hero(){

    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
