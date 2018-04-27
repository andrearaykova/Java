import java.util.Scanner;

/**
 * Created by andrearaykova on 28.11.17.
 */
public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        String result = first + second + third;
        StringBuilder reverse = new StringBuilder();
        reverse.append(result).reverse();
        System.out.println(reverse);
    }
}
