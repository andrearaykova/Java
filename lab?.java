import java.util.Scanner;

/**
 * Created by andrearaykova on 3/15/17.
 */
public class lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine()) * 100;
        double h = Double.parseDouble(scanner.nextLine()) * 100;

        double cols = (h - 100) / 70;

        double rows = Math.floor(w / 120);
         double result = Math.floor(rows * cols - 3);

        System.out.println(Math.floor(result));

    }
}
