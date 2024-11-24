package homework_nr_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zoo {

    public static Set<String> getUniqAnimals(List<String> animals) {
        return new HashSet<>(animals);
    }

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Tiger");
        animals.add("Wolf");
        animals.add("Leon");
        animals.add("Bear");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Elephant");

        System.out.println(animals);
        Set<String> noDuplicateAnimals = getUniqAnimals(animals);
        System.out.println(noDuplicateAnimals);

    }

}
