package homework_nr_9;

import java.util.*;

public class Vocabulary {

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Tiger", "Tigru");
        dictionary.put("Wolf", "Lup");
        dictionary.put("Leon", "Leu");
        dictionary.put("Bear", "Urs");
        dictionary.put("Elephant", "Elefant");
        dictionary.put("Fox", "Vulpe");
        dictionary.put("Zebra", "Zebra");
        dictionary.put("Giraffe", "Girafa");
        dictionary.put("Monkey", "Maimuta");
        dictionary.put("Deer", "Cerb");

        System.out.println("English-Romanian Dictionary:");
        for (Map.Entry<String, String> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        }

}
