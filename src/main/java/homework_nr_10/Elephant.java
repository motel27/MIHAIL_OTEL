package homework_nr_10;

public class Elephant implements Animal {

    private String name;

    public Elephant(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating grass");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping standing up.");
    }

    @Override
    public void run() {
        System.out.println(name + " is running slowly.");
    }

    @Override
    public void makesound() {
        System.out.println(name + " sounds loud.");
    }

}
