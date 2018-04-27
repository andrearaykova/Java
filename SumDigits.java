import java.util.Scanner;

/**
 * Created by andrearaykova on 2/21/17.
 */
public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        while (n > 0) {
            num += n % 10;
            n /= 10;


        }
        System.out.println(num);
    }
}
