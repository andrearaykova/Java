import java.util.Scanner;

/**
 * Created by andrearaykova on 9/21/17.
 */
public class oddnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

       while (n % 2 == 0 ) {
           System.out.println("Please write an odd number.");
           n = Integer.parseInt(scanner.nextLine());
       } if (n < 0) {
            System.out.println("The number is: " + (-n));
        }else {
            System.out.println("The number is: " + n);
        }

    }
}
