package lesson04.composite;

import lesson04.fasade.MyReader;

import java.io.IOException;
import java.util.List;

public class Wizard implements Skill{

    private List<Skill> skills;

    public Wizard(List<Skill> skills) {
        this.skills = skills;
    }

    public void castSkill() {

        int len = skills.size();
        MyReader myReader = new MyReader();
        System.out.println("Маг кастует:");
        int s = -1;

        while (s != 0) {
            try {
                s = myReader.readInt();
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (s) {
                case 1:
                    skills.get(0).castSkill();
                    break;
                case 2:
                    skills.get(1).castSkill();
                    break;
                case 0:
                    System.out.println("Закончил кастовать");
                    break;
                default:
                    System.out.println("Такого скила нет");
            }
        }
    }
}
