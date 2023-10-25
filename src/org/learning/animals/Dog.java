package org.learning.animals;

public class Dog extends Animal{
    public Dog() {
    }
    public Dog(String name) {
        super(name);
    }


    @Override
    public void animalNoise() {
        System.out.println("Bark! Bark!");
    }

    @Override
    public void food() {
        System.out.println("Diet: Everything but chocolate, poor dogs...");
    }
}
