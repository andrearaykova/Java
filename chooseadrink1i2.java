import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by andrearaykova on 9/19/17.
 */
public class chooseadrink1i2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String profession = scanner.nextLine();
         int quantities = Integer.parseInt(scanner.nextLine());

         double pricew = 0.70;
         double pricec = 1.00;
         double priceb = 1.70;
         double pricet = 1.20;

        DecimalFormat newFormat = new DecimalFormat("#0.00");

         if (profession.equals( "Athlete")) {
             System.out.println("The Athlete has to pay " + newFormat.format(quantities*pricew) + ".");

        }
         else if (profession.equals( "Businessman") || profession.equals("Businesswoman")) {
             System.out.println("The " + profession + " has to pay " + newFormat.format(quantities*pricec) + ".");
         }
          else if (profession.equals("SoftUni Student")) {
             System.out.println("The SoftUni Student has to pay " + newFormat.format(quantities*priceb) + ".");

         }
         else {

             System.out.printf("The " + profession + " has to pay " + newFormat.format(quantities*pricet) + "." );

         }
    }
}
