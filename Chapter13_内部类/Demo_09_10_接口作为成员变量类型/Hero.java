package Chapter13_内部类.Demo_09_10_接口作为成员变量类型;

public class Hero {
    private String name;
    private Skill skill;

    public Hero(){

    }

    public void attack(){
        System.out.print("英雄" + name + "使用技能");
        skill.use();
        System.out.println("攻击了你！");
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
