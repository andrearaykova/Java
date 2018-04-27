import java.util.Scanner;

/**
 * Created by andrearaykova on 2/20/17.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = Integer.parseInt(scanner.nextLine());
        long fact = 1;
        do {
            fact = fact * a;
            a--;
        } while (a > 0);
        System.out.println(fact);
    }
}
