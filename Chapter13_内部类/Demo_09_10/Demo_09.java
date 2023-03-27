package Chapter13_内部类.Demo_09_10;

//接口作为成员变量类型

public class Demo_09 {

    public static void main(String[] args) {
        //创建英雄对象
        Hero hero = new Hero();

        //设置英雄名称
        hero.setName("艾希");

        //设置英雄技能
        hero.setSkill(new SkillImpl());

        hero.attack();

    }
}
