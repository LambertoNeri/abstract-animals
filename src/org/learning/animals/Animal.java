package org.learning.animals;

public abstract class Animal {

    private String name;

    public Animal(){}
    public Animal(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println(name + " fells asleep...ZzZz");
    }
    public abstract void animalNoise();
    public abstract void food();

    public String getName() {
        return name;
    }
}
