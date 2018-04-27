import java.util.Scanner;

/**
 * Created by andrearaykova on 3/5/17.
 */
public class hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String month = scanner.nextLine();
         int nights = Integer.parseInt(scanner.nextLine());
         double studio = 0;
         double aprtment = 0;

         if ( month.equals("May") || month.equals("October")) {
             studio = nights * 50.0;
             aprtment = nights * 65.0;
             if (nights > 7 && nights < 14 ) {
                 studio -= studio * 0.05;

             } else if (nights > 14) {
                 studio -= studio * 0.30;
                 aprtment -= aprtment * 0.10;
             }


         } else if (month.equals("June") || month.equals("September")){
             studio = nights * 75.20;
             aprtment = nights * 68.70;

             if (nights > 14) {
                 studio -= studio * 0.20;
                 aprtment -= aprtment * 0.10;
             }

         } else {
             studio = nights * 76.0;
             aprtment = nights * 77.0;
             if (nights > 14) {


                 aprtment -= aprtment * 0.10;
             }



         }
        System.out.printf("Apartment: %.2f lv.\n",aprtment);
        System.out.printf("Studio: %.2f lv.\n",studio);

    }
}
