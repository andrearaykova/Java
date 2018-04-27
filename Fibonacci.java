import java.util.Scanner;

/**
 * Created by andrearaykova on 2/21/17.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n < 2) {
            System.out.println(1);
            return;
        }
        int f0 = 0;
        int f1 = 1;
        int fsum = 0;

        for (int i = 0; i < n; i++) {
            fsum = f1 + f0;
            f0 = f1;
            f1 = fsum;

        }
        System.out.println(fsum);
    }
}
