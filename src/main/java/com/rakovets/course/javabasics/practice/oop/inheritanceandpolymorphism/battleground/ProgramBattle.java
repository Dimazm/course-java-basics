package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class ProgramBattle {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Warrior ivan = new Warrior("Shrek");
        ivan.setHealth(150);
        Zoomby zoomby = new Zoomby(150);
        System.out.println(ANSI_GREEN + "Zoombe has " + zoomby.getHealth() + ANSI_RESET +
                "-----" + ANSI_RED + "Hero has " + ivan.getHealth() + ANSI_RESET);

        for (int i = 0; zoomby.isAlive(zoomby.health); i++) {
            System.out.println("----------------");
            ivan.attackEnemy(zoomby);
            System.out.println(ANSI_GREEN + "Zoombe has " + zoomby.getHealth() + ANSI_RESET);
            if (zoomby.isAlive(zoomby.health)) {
                zoomby.attackHero(ivan);
                System.out.println(ANSI_RED + "Hero has " + ivan.getHealth() + ANSI_RESET);
                if (!ivan.isAlive(ivan.health)) {
                    System.out.println(ANSI_RED + "Hero is dead with " + ivan.getHealth() + ANSI_RESET);
                    System.out.println("----------------");
                    break;
                }
            } else if (zoomby.revive == 1){
                zoomby.superknowlidge();
                System.out.println(ANSI_RED + "Zoomby's health has been increased for " + zoomby.getHealth() + ANSI_RESET);
            } else{
                System.out.println(ANSI_RED + "Enemy is dead with " + zoomby.getHealth() + ANSI_RESET);
                System.out.println("----------------");

            }
        }
    }
}
