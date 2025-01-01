package homework_nr_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle tesla = new Vehicle("Tesla", 2023);
        Vehicle ford = new Vehicle("Ford", 2015);
        Car bmw = new Car("BMW", 2021, "Petrol");
        Car Audi = new Car("Q5", 2014, "Petrol");

        Storage<Vehicle> vehicleStorage = new Storage<>();
        vehicleStorage.addItem(tesla);
        vehicleStorage.addItem(ford);
        vehicleStorage.addItem(bmw);
        vehicleStorage.addItem(Audi);

        Warehouse<Vehicle> warehouse = new Warehouse<>();
        warehouse.addStorage(vehicleStorage);

        System.out.println("Общее количество транспортных средств: " + warehouse.getTotalItems());

            List<Vehicle> sourceList = Arrays.asList(tesla, ford, bmw);
            List<Vehicle> destinationList = new ArrayList<>();
            FilterUtils.VehicleUtils.copyVehicles(sourceList, destinationList);
            System.out.println("Список после копирования: " + destinationList);

             List<Vehicle> filteredVehicles = FilterUtils.filter(sourceList, v -> v.getYear() > 2018);
             System.out.println("Транспортные средства после фильтрации: " + filteredVehicles);
    }
}

