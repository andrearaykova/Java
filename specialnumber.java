import java.util.Scanner;

/**
 * Created by andrearaykova on 9/28/17.
 */
public class specialnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            int digits = i;
            while (digits > 0) {
                sumOfDigits += digits % 10;
                digits = digits / 10;
            }

            boolean special = (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11);
            {
                System.out.println(i + " -> " + special);
            }
        }
    }
}

