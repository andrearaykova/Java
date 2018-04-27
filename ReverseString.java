import java.util.Scanner;

/**
 * Created by andrearaykova on 10/23/17.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(new StringBuilder(input).reverse().toString());
    }
}
