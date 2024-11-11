package homework_nr_3;

public class HomeWork3 {

    public static void main(String[] args) {

      int month = 13;                                             //step 4 from homework
       switch (month) {
           case 1: System.out.println(month + " January");
               break;
           case 2: System.out.println(month + " February");
               break;
           case 3: System.out.println(month + " March");
               break;
           case 4: System.out.println(month + " April");
               break;
           case 5: System.out.println(month + " May");
               break;
           case 6: System.out.println(month + " June");
               break;
           case 7: System.out.println(month + " July");
               break;
           case 8: System.out.println(month + " August");
               break;
           case 9: System.out.println(month + " September");
               break;
           case 10: System.out.println(month + " October");
               break;
           case 11: System.out.println(month + " November");
               break;
           case 12: System.out.println(month + " December");
               break;
           default: System.out.print("Invalid Month number");
       }

    for (int a = 100; a<=1000; a++){                                //step 5 from homework
       if (a % 5 == 0)
        System.out.println(a);
    else{};
    }



      for (int x = 1; x<=97; x+=2) {                              //step 6
        float y = x+2f;
        float z = x/y;

          System.out.println(z);


      }


}}
