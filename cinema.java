import java.util.Scanner;

/**
 * Created by andrearaykova on 1/21/17.
 */
public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String films = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double price = r * c;

        switch (films) {
            case "Premiere":
                System.out.printf( "%.2f leva" ,price * 12.00);
                break;
            case "Normal":
                System.out.printf( "%.2f leva" ,price * 7.50);
                break;
            case "Discount":
                System.out.printf("%.2f leva", price * 5.00);
                break;

        }
    }
}
