import java.util.Scanner;

/**
 * Created by andrearaykova on 3/18/17.
 */
public class cartogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (money <= 100) {
            System.out.println("Economy class");
            if (season.equals("Summer")) {
                money = money * 35 / 100;
                System.out.print("Cabrio - ");
                System.out.printf("%.2f",money);

            } else {
                money = money * 65 / 100;
                System.out.print("Jeep - ");
                System.out.printf("%.2f",money);
            }
        }
        else if (money > 100 && money <= 500 ) {
            System.out.println("Compact class");
            if (season.equals("Summer")) {
                money = money * 45 / 100;
                System.out.print("Cabrio - ");
                System.out.printf("%.2f",money);

            } else {
                money = money * 80 / 100;
                System.out.print("Jeep - ");
                System.out.printf("%.2f",money);
            }
        }
        else if (money > 500) {
            System.out.println("Luxury class");
            if (season.equals("Summer")) {
                money = money * 90 / 100;
                System.out.print("Jeep - ");
                System.out.printf("%.2f",money);

            } else {
                money = money * 90 / 100;
                System.out.print("Jeep - ");
                System.out.printf("%.2f",money);
            }
        }
    }
}
