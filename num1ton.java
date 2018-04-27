import java.util.Scanner;

/**
 * Created by andrearaykova on 2/18/17.
 */
public class num1ton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i+=3) {
            System.out.println(i);

        }
    }
}
