import java.util.Scanner;

/**
 * Created by andrearaykova on 3/15/17.
 */
public class price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String dayornight = scanner.nextLine();


        double taxiday = 0.70 + (km * 0.79);
        double taxinight = 0.70 + (km * 0.90);
        double bus = km * 0.09;
        double train = km * 0.06;

        if (km < 20 && dayornight.equals("day")) {
            System.out.println(taxiday);
        } else if (km < 20 && dayornight.equals("night")) {
            System.out.println(taxinight);
        } else if (km >= 20 && km < 100) {
            System.out.println(bus);
        } else {
            System.out.println(train);
        }


    }
}
