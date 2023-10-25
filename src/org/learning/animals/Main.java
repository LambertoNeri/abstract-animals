package org.learning.animals;


import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Eagle ferdinandoLAquila = new Eagle("Ferdinando");
        Dog luiginoIlCane = new Dog("Luigino");
        Dolphin cicoloIlDelfino = new Dolphin("Cicolo");
        Sparrow ottoIlPasserotto = new Sparrow("Otto Il Passerotto");


        ferdinandoLAquila.animalNoise();
        ferdinandoLAquila.food();
        ferdinandoLAquila.sleep();
        ferdinandoLAquila.fly();
        System.out.println("-----------------------------------------------------");
        ottoIlPasserotto.animalNoise();
        ottoIlPasserotto.food();
        ottoIlPasserotto.sleep();
        ottoIlPasserotto.fly();
        System.out.println("-----------------------------------------------------");
        luiginoIlCane.animalNoise();
        luiginoIlCane.food();
        luiginoIlCane.sleep();
        System.out.println("-----------------------------------------------------");
        cicoloIlDelfino.animalNoise();
        cicoloIlDelfino.food();
        cicoloIlDelfino.sleep();
        cicoloIlDelfino.swim();


        Eagle aquila2 = new Eagle("aquila2");


        flyer(aquila2);
    }

    public static void flyer(CanFly flyer){
        flyer.fly();
    }
    public static void swimmer(CanSwim swimmer){
        swimmer.swim();
    }








}
