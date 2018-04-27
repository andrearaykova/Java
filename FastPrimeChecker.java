import java.util.Scanner;

/**
 * Created by andrearaykova on 9/30/17.
 */
public class FastPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= num; i++) {
            String istrue = "True";
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    istrue = "False";
                    break;
                }

            }
            System.out.println(i + " -> " + istrue);

        }
    }
}
