package homework_nr_8;

public abstract class Appliance {

    String brand;
    int power;

    public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public abstract String turnOn();

    public void displayInfo() {
        System.out.println("Brand - " + brand);
        System.out.println("Power - " + power + " Bt");
        System.out.println(turnOn());
    }


        public static void main(String[] args) {

            Appliance[] appliance = new Appliance[]{

                    new WashingMachine("LG", 2000, 7.5),
                    new Microwave("Samsung", 1200, true),
            };

            for (int i = 0; i != appliance.length; i++) {
                //System.out.println(appliance[i].displayInfo());
                appliance[i].displayInfo();

                if (appliance[i] instanceof WashingMachine) {
                    WashingMachine machine = (WashingMachine) appliance[i];
                    System.out.println("This is a washing machine with a load capacity of " + machine.loadCapacity + "kg");
                } else if (appliance[i] instanceof Microwave) {
                    Microwave machine2 = (Microwave) appliance [i];
                    System.out.println("This is a microwave with a grill: " + machine2.hasGrill);
                }

            }
        }
    }



