import java.util.Scanner;

/**
 * Created by andrearaykova on 28.11.17.
 */
public class BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("True")) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
