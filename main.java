import java.util.Scanner;

/**
 * Created by andrearaykova on 2/27/17.
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVeg = Double.parseDouble(scanner.nextLine());
        double priceFr = Double.parseDouble(scanner.nextLine());
        double sumVeg = Double.parseDouble(scanner.nextLine());
        double sumFr = Double.parseDouble(scanner.nextLine());

        double result = (priceVeg * sumVeg) + (priceFr * sumFr);
        result = result / 1.94;
        System.out.println(result);



    }
}












//public static String doMagic(String text,int repeatCount) {
//   String output = "";
//   for (int i = 0; i < repeatCount; i++) {
//       output = output + text;

//   }
//   return output;
//
//
