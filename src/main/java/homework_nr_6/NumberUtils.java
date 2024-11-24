package homework_nr_6;

public class NumberUtils {


        public static boolean isPrime(int number) {
            if (number > 0 && number % 2 == 1) {
                return true;
            }
            return false;
        }

        public static void findPrimesInArray(int[] numbers){
            for (int number : numbers)
                System.out.println((isPrime(number)) ? "prime number " + number : "not prime number " + number);

        }
        public static void main(String[] args) {

            int[] number = {1, 2, 3, 4, 5, 10, 11, 12, 13};
            findPrimesInArray(number);

        }

    }

