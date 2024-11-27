package homework_nr_10;

public class Main {

    public static void main(String[] args) {
        Animal elephant = new Elephant("Tumbo");
        elephant.eat();
        elephant.sleep();
        elephant.run();
        elephant.makesound();
        elephant.description();
        Animal.AgeInfo();
        System.out.println("-----------------------------------------");

        ElephantHerbivore Elephant1 = new ElephantHerbivore("Simbo");
        Elephant1.families();
        Elephant1.describeDiet();

    }
}
