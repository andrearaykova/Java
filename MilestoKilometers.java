import java.util.Scanner;

/**
 * Created by andrearaykova on 9/19/17.
 */
public class MilestoKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mile = Double.parseDouble(scanner.nextLine());
        double kilom = 1.60934 * mile;

        System.out.printf("%.2f", kilom);

    }
}
