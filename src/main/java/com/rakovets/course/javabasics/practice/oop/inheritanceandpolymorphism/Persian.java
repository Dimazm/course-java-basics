package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

 class Persian extends Cat{

     Persian (String name){
         super(name);
     }

     @Override
     public String mew() {
         return "Moa-Moa-Moa";
     }

     @Override
     public String purr() {
         return "Prrrr_Prrrr-Prrrsss";
     }
     @Override
     public void mew(Person person) {
         person.changeHappiness(-60);
     }

     @Override
     public void purr(Person person) {
         person.changeHappiness(59);
     }
}
