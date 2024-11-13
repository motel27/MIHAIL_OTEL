package homework_nr_5;



public class HomeWorkNr5 {

    public static void main(String[] args) {
        int sumodd = 0;
        int sumEven = 0;
        int[] numbers = new int[]
        {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                    11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                    21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                    31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                    41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                    51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                    61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                    71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                    81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                    91, 92, 93, 94, 95, 96, 97, 98, 99, 100
        };
        System.out.println(numbers.length);

    for (int x : numbers) {
        if (numbers[x] % 2 != 0) {
                sumodd += x;
        }}
        System.out.println("sum of odd numbers " + sumodd);



        for (int z : numbers) {
            if (numbers[z] % 2 ==0) {
            sumEven += z;
            }}
            System.out.println("sum of even number " +sumEven);


        int [] copyNumbers = new int [numbers.length];
        for (int i =0; i<numbers.length; i++)
        {
        copyNumbers[i] = numbers[i];
        }

        System.out.println(copyNumbers.length);

        }

}

