package org.learning.animals;

public class Dolphin extends Animal implements CanSwim{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void animalNoise() {
        System.out.println("Click! Click!");
    }

    @Override
    public void food() {
        System.out.println("Diet: Fish");
    }

    @Override
    public void swim() {
        System.out.println("I'm a dolphin and I am swimming");
    }
}
