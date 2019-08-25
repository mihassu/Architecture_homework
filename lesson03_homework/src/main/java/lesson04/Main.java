package lesson04;

import lesson04.composite.SingleSkill;
import lesson04.composite.Skill;
import lesson04.composite.Wizard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SingleSkill fireBall = new SingleSkill("Огненный шар");
        SingleSkill lightning = new SingleSkill("Молния");

        List<Skill> skills = new ArrayList<Skill>();
        skills.add(fireBall);
        skills.add(lightning);

        Wizard wizard = new Wizard(skills);
        wizard.castSkill();

    }
}
