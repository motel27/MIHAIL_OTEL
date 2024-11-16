package homework_nr_5;



public class HomeWorkNr5 {

    public static void main(String[] args) {
        int sumodd = 0;
        int sumEven = 0;
        int[] numbers = new int[101];

        for (int i = 0; i < numbers.length; i++) {      //used for loop to populate the array
            numbers[i] = i;
        }
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

