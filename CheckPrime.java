import java.util.Scanner;

/**
 * Created by andrearaykova on 2/21/17.
 */
public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean prime = true;
        for (int i = 2; i <  n && n >= 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;

        }
        } if (prime && n >= 2){
            System.out.println("prime");
        }

      else {
            System.out.println("not prime");
        }

    }
}
