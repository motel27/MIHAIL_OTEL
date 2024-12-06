package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {

    CHECK_IF_ODD(a -> a % 2 != 0),
    CHECK_IF_EVEN(a -> a % 2 == 0),
    CHECK_IF_NEGATIVE(a -> a < 0),
    CHECK_IF_POSITIVE(a -> a > 0);

    private final Predicate<Integer> check;
    CheckInteger(Predicate<Integer>check){
        this.check = check;
    }
    public boolean test(int number) {
        return check.test(number);
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = -4;
        int number3 = 6;

        System.out.println("is " + number1 + " even? - "+ CheckInteger.CHECK_IF_EVEN.test(number1));
        System.out.println("is " + number1 + " negative? - "+ CheckInteger.CHECK_IF_NEGATIVE.test(number1));
        System.out.println("is " + number2 + " odd? - "+ CheckInteger.CHECK_IF_ODD.test(number1));
        System.out.println("is " + number2 + " positive - "+ CheckInteger.CHECK_IF_POSITIVE.test(number1));
        System.out.println("is " + number3 + " odd? - "+ CheckInteger.CHECK_IF_ODD.test(number1));
    }
}
