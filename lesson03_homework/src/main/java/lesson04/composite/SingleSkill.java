package lesson04.composite;

public class SingleSkill implements Skill{

    private String skillName;

    public SingleSkill(String skillName) {
        this.skillName = skillName;
    }

    public void castSkill() {
        System.out.println("кастует " + skillName);
    }
}
