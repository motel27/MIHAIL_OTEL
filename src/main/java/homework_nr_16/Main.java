package homework_nr_16;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        AnimalShelter shelter = new AnimalShelter();

        System.out.println("Dogs and Cats sounds:");
        shelter.callMakeSoundForAnimals(animals);

        List<Dog> dogs = new ArrayList<>();
        shelter.addDogtoList(dogs, new Dog());
        shelter.addDogtoList(dogs, new Dog());
        shelter.addDogtoList(dogs, new Dog());

        System.out.println("All dogs from the shelter bark:");
        shelter.callMakeSoundForAnimals(dogs);

    }
}
