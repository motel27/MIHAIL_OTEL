package homework_nr_10;

public interface Animal {

    int minWeight = 0;
    int maxWeight = 150000;

    void eat();
    void run();
    void sleep();
    void makesound();

    static void AgeInfo(){
        System.out.println("Min weight of Animals is between " + minWeight + " and " + maxWeight + " kg");
    }
        default void description(){
            System.out.println("This is Animal");
        }
}
