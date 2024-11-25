package homework_nr_6;

public class ArrayUtils {

    public static int findMax (int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(int[] numbers2){
        int min = numbers2[0];
            for (int number : numbers2) {
                if (number < min) {
                    min = number;
                }
            }
        return min;
    }

    public static void main(String[] args) {

        int [] array = {1, 2, 20, 100, 1000, 10};
        int maxValue = findMax(array);
        System.out.println("max number from array is: " + maxValue);

        int minValue = findMin(array);
        System.out.println("min numver from array is: " + minValue);
    }

}
