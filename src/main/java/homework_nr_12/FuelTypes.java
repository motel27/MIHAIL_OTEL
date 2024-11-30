package homework_nr_12;

public enum FuelTypes {

    GASOLINE(true),
    DIESEL(true),
    LPG(false),
    CNG(false);

    private final boolean isLiquid;

    FuelTypes(boolean isLiquid) {
        this.isLiquid = isLiquid;
    }
    public boolean isLiquidFuel() {
        return isLiquid;
    }
    public static void main(String[] args) {
        System.out.println("GASOLINE: " + FuelTypes.GASOLINE.isLiquidFuel());
        System.out.println("LPG: " + FuelTypes.LPG.isLiquidFuel());
        System.out.println("DIESEL: " + FuelTypes.DIESEL.isLiquidFuel());
    }
}
