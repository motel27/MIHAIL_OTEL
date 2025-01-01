package homework_nr_15;

public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Hello", 42);
        System.out.println("First: " + pair1.getFirst());
        System.out.println("Second: " + pair1.getSecond());

        Pair<String, Boolean> pair2 = new Pair<>("Java", true);
        System.out.println("First: " + pair2.getFirst());
        System.out.println("Second: " + pair2.getSecond());


        Box<Integer> intBox = new Box<>(100);
        System.out.println("Content: " + intBox.getContent());
        intBox.setContent(200);
        System.out.println("Updated Content: " + intBox.getContent());

        Box<String> strBox = new Box<>("Generics are useful!");
        System.out.println("Content: " + strBox.getContent());
    }
}
