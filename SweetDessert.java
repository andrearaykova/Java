import java.util.Scanner;

/**
 * Created by andrearaykova on 11/4/17.
 */
public class SweetDessert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cash = Double.parseDouble(scanner.nextLine());
        double guests = Double.parseDouble(scanner.nextLine());
        double banana = Double.parseDouble(scanner.nextLine());
        double eggs = Double.parseDouble(scanner.nextLine());
        double berries = Double.parseDouble(scanner.nextLine());

        double portions = Math.ceil(guests / 6);

        double neededMoney = (portions * (2 * banana)) +
                (portions * (4 * eggs)) + (portions * (0.2 * berries));



        if (neededMoney <= cash) {
            System.out.printf("Ivancho has enough money - it would cost %.2flv.",neededMoney);
        } else {
            neededMoney = neededMoney - cash;
            System.out.printf("Ivancho will have to withdraw money - he will need %.2flv more.",neededMoney);
        }
    }
}
