package homework_nr_4;

public class TemperatureConverter {

    public static void main(String[] args) {

        TemperatureConverter a = new TemperatureConverter();
     double c =  toCelsius(80);                      //insert value of Fahrenhei
      double f = toFahrenheit(30);                     //insert value of Celsius

      System.out.println(c + " Degree Celsius");
      System.out.println(f + " Fahrenhei");

    }

        public static double toCelsius(double farenheiit){
            double result = (farenheiit - 30) / 2;
            return result;
        }

        public static double toFahrenheit(double celsius){
            double result = (celsius * 2) + 30;
            return result;
        }

    }


