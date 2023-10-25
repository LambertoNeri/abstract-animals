package org.learning.animals;

import javax.xml.namespace.QName;

public class Sparrow extends Animal implements CanFly{



    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void animalNoise() {
        System.out.println(this.getName() + " Pieno di felictà!");
        System.out.println("Chirp! Chirp!");
    }

    @Override
    public void food() {
        System.out.println("Diet: Fruit");
    }

    @Override
    public void fly() {
        System.out.println("I'm a sparrow and I am flying");
    }
}
