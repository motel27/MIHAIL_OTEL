package homework_nr_17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterUtils {

    public static <T> List<T> filter(List<T> items, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }

    class VehicleUtils {
        public static void copyVehicles(List<? extends Vehicle> source, List<? super Vehicle> destination) {
            destination.addAll(source);
        }
}
}


