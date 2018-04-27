import java.util.Scanner;

/**
 * Created by andrearaykova on 3/8/17.
 */
public class harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double z = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());

        double grape = x * y;
        double wine = 0.4 * grape / 2.5;

        if (wine >= z) {
            double left = wine - z;
            double leftworkers = left / workers;
            System.out.printf("Good harvest this year! Total wine: %s liters.",(int)Math.floor(wine));
            System.out.println();
            System.out.printf(" %s liters left -> %s liters per person.",(int)Math.ceil(left) ,(int)Math.ceil(leftworkers));
        } else {
            double left = Math.floor(z - wine);
            System.out.printf("It will be a tough winter! More %s liters wine needed.",(int)left);

        }

    }
}
