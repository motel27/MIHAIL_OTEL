package homework_nr_7;

public class Motorcycle extends Vehicle{

    private double engineCapacity;
    private boolean hasABS;

    public Motorcycle(String brand, String model, int year, double engineCapacity, boolean hasABS) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
        this.hasABS = hasABS;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println("Has ABS: " + (hasABS ? "Yes" : "No"));

    }
}
