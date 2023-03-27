package Chapter13_内部类.Demo_08;

//类作为成员变量类型

public class Demo_08 {
    public static void main(String[] args) {
        //创建一个Hero对象
        Hero hero = new Hero();

        //为Hero设置参数
        hero.setName("盖伦");
        hero.setAge(21);

        //为Weapon设置参数
        Weapon weapon = new Weapon("大宝剑");

        //为Hero配置Weapon
        hero.setWeapon(weapon);

        //使用Hero的方法
        hero.attack();
    }
}
