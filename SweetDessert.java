import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by andrearaykova on 10/20/17.
 */
public class SweetDessert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cash = Double.parseDouble(scanner.nextLine());
        double guests = Double.parseDouble(scanner.nextLine());
        double bananasPrice = Double.parseDouble(scanner.nextLine());
        double eggsPrice = Double.parseDouble(scanner.nextLine());
        double berriesPrice = Double.parseDouble(scanner.nextLine());

        double portions = Math.ceil(guests / 6);

        double neededMoney = (portions * (2 * bananasPrice)) +
                (portions * (4 * eggsPrice)) + (portions * (0.2 * berriesPrice));



        if (neededMoney <= cash) {
            System.out.printf("Ivancho has enough money - " +
                    "it would cost %.2f lv.",neededMoney);
        } else {
            neededMoney = neededMoney - cash;
            System.out.printf("Ivancho will have to withdraw money - he will need %.2f lv more.",neededMoney);
        }

    }
}