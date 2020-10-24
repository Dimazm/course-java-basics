package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Zoomby extends Enemy {

    private int damage = 30;
    protected int revive = 1;

    public Zoomby(int health) {
        super(health);
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(damage);
        System.out.println("Zoomby has attacked Hero and takes " + damage + " of Health");
    }

    public void superknowlidge() {
        if (this.revive == 1) {
            this.setHealth(100);
            this.revive--;
        }
    }
}
