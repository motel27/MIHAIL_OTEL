package homework_nr_14;

public class InvalidRangeException extends Exception {
    public InvalidRangeException(String message) {
        super(message);
    }
}

    class RangeCalculator {
        public int isDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
            if (inferiorLimit > superiorLimit) {
                throw new InvalidRangeException("Inferior limit can't be greater than superior limit");
            }

            int count = 0;
            for (int x = inferiorLimit; x <= superiorLimit; x++) {
                if (x % 7 == 0) {
                    System.out.println(x);
                    count++;
                }
            }
            return count;
        }
}
