import java.util.Scanner;

/**
 * Created by andrearaykova on 10/24/17.
 */
public class UnicodeCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length() ; i++) {

            int asciNum = input.charAt(i);
            sb.append(String.format("\\u%04x", asciNum));
        }
        System.out.println(sb.toString());
    }
}
