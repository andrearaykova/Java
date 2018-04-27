import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrearaykova on 29.11.17.
 */
public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String text = scanner.nextLine();

        String[] emailSplit = email.split("@");

        String newEmail = newString("*", emailSplit[0].length()) + "@" + emailSplit[1];
        text = text.replaceAll(email, newEmail);
        System.out.println(text);
    }

    static StringBuilder newString(String symbol, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(symbol);
        }

        return sb;
    }
}
