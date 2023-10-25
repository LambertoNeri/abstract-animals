package org.learning.animals;

public class Eagle extends Animal implements CanFly{
    public Eagle(String name) {
        super(name);
    }
    public Eagle(){

    }

    @Override
    public void animalNoise() {
        System.out.println("Skree! Skree!");
    }

    @Override
    public void food() {
        System.out.println("Diet: Meat");
    }

    @Override
    public void fly() {
        System.out.println("I am an eagle and I am flying");
    }
}
