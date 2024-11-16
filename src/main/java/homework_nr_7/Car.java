package homework_nr_7;


class Car extends Vehicle {
    private int numberOfDoors;
    private boolean isElectric;


    public Car(String brand, String model, int year, int numberOfDoors, boolean isElectric) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Is Electric: " + (isElectric ? "Yes" : "No"));
    }
}

