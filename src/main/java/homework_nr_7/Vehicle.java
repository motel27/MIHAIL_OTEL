package homework_nr_7;

public class Vehicle {

  private String brand;
  private String model;
  private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

        }

        public static void main(String[] args) {

            Car car = new Car("Tesla", "Model S", 2023, 4, true);
            Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF-R3", 2021, 321.0, true);

            System.out.println("Car:");
            car.displayInfo();
            System.out.println("---------------------------------------");
            System.out.println("Motorcycle:");
            motorcycle.displayInfo();


}}