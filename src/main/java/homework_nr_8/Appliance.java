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
                    new  AirConditioner ("Daikin", 1500, 12000, true)
            };

            for (int i = 0; i != appliance.length; i++) {
                appliance[i].displayInfo();

                if (appliance[i] instanceof WashingMachine) {
                    WashingMachine appliance1 = (WashingMachine) appliance[i];
                    System.out.println("This is a washing machine with a load capacity of " + appliance1.loadCapacity + "kg");
                    System.out.println("-----------------------");
                } else if (appliance[i] instanceof Microwave) {
                    Microwave appliance2 = (Microwave) appliance [i];
                    System.out.println("This is a microwave with a grill: " + appliance2.hasGrill);
                    System.out.println("-----------------------");
                } else if (appliance[i] instanceof AirConditioner){
                    AirConditioner appliance3 = (AirConditioner) appliance[i];
                    System.out.println("This is an air conditioner with cooling power of "+ appliance3.coolingPower +" BTU and inverter: " + appliance3.hasInverter);
                }

            }
        }
    }




