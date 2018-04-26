import java.util.Scanner;

/**
 * Created by andrearaykova on 12/19/16.
 */
public class USDtoBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("usd: ");
        double usd = Double.parseDouble(console.nextLine());
        double bgn = 1.79549 * usd;
        System.out.printf("%.2f",bgn);

    }
}