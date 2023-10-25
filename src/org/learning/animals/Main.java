package org.learning.animals;



public class Main {
    public static void main(String[] args) {
        Eagle ferdinandoLAquila = new Eagle("Ferdinando");
        Dog luiginoIlCane = new Dog("Luigino");
        Dolphin cicoloIlDelfino = new Dolphin("Cicolo");
        Sparrow ottoIlPasserotto = new Sparrow("Otto Il Passerotto");


        ferdinandoLAquila.animalNoise();
        ferdinandoLAquila.food();
        ferdinandoLAquila.sleep();
        System.out.println("-----------------------------------------------------");
        ottoIlPasserotto.animalNoise();
        ottoIlPasserotto.food();
        ottoIlPasserotto.sleep();
        System.out.println("-----------------------------------------------------");
        luiginoIlCane.animalNoise();
        luiginoIlCane.food();
        luiginoIlCane.sleep();
        System.out.println("-----------------------------------------------------");
        cicoloIlDelfino.animalNoise();
        cicoloIlDelfino.food();
        cicoloIlDelfino.sleep();
    }


}
