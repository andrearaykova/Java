import java.util.Scanner;

/**
 * Created by andrearaykova on 2/6/17.
 */
public class leftright {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;
        int sum = 0;


        for (int i = 0; i < n ; i++) {

            sum = Integer.parseInt(scanner.nextLine());
            left += sum;


        }
        for (int i = 0; i < n; i++) {
            sum = Integer.parseInt(scanner.nextLine());
            right += sum;

        }
        if (left == right) {
            System.out.println("Yes, sum = " + left);

        } else {
            System.out.println("No, diff = " + Math.abs(right - left));
        }
    }
}
