import java.util.Scanner;

/**
 * Created by andrearaykova on 9/29/17.
 */
public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        System.out.println(third + second + first);

    }
}
