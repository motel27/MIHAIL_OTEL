package homework_nr_14;

public class Main {
    public static void main(String[] args) {
        Airplane2 factory = new Airplane2();


        Airplane airplane1 = factory.createAirplaneLBYL("Cessna", "Citation Longitude", 2);
        Airplane airplane2 = factory.createAirplaneLBYL("", "A380", 2);


        Airplane airplane3 = factory.createAirplaneEAFP("Embraer", "E190", 2);
        Airplane airplane4 = factory.createAirplaneEAFP("Boeing", null, 4);

        System.out.println("-------------------------");
        System.out.println(airplane1);
        System.out.println(airplane2);
        System.out.println(airplane3);
        System.out.println("-------------------------");

        // Count
        RangeCalculator calculator = new RangeCalculator();
        try {
            System.out.println("Numbers divisible by 7 in the range:");
            int count = calculator.isDivisibleBy7Numbers(10, 50);
            System.out.println("Count of numbers divisible by 7: " + count);
        } catch (InvalidRangeException e) {
            System.err.println("Error in range: " + e.getMessage());
        }
    }
}
