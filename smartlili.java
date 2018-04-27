import java.util.Scanner;

/**
 * Created by andrearaykova on 3/11/17.
 */
public class smartlili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double pricetoy = Double.parseDouble(scanner.nextLine());

        double savings = 0;
        double presents = 0;
        double bonus = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savings += bonus;
                savings -= 1;
                bonus += 10;
            } else {
                presents += pricetoy;
            }

        } double allmoney = savings + presents;
        if (allmoney >= price) {
            double sum = allmoney - price;
            System.out.printf("Yes! " + "%.2f",sum);
        } else {
            double sum = price - allmoney;
            System.out.printf("No! " + "%.2f",sum);
        }

    }
}
