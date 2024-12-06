package homework_nr_12;

public enum FuelTypes {

    GASOLINE,
    DIESEL,
    LPG,
    CNG;

    public boolean isLiquidFuel() {
        return this == GASOLINE || this == DIESEL;
    }

    public static void main(String[] args) {
        System.out.println("GASOLINE: " + FuelTypes.GASOLINE.isLiquidFuel());
        System.out.println("LPG: " + FuelTypes.LPG.isLiquidFuel());
        System.out.println("DIESEL: " + FuelTypes.DIESEL.isLiquidFuel());
    }
}
