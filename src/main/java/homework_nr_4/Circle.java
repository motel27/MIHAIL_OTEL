package homework_nr_4;

public class Circle {

    public static void main(String[] args) {

        double radius = 10;
        double area = calculateArea(radius);
        System.out.println(area);

        Circle circle = new Circle(radius);
        calculateArea(radius);

    }


        public static double calculateArea(double number){

            double result =  3.14 * number * 10;
            return result;
            }

                public Circle (double inputRadius)
                {
                    double radius = inputRadius;

                }

}
