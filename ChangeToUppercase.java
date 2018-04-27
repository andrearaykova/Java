import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrearaykova on 1.12.17.
 */
public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("<upcase>(.*?)</upcase>");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            text = text.replace(matcher.group(0), matcher.group(1).toUpperCase());
        }

        System.out.println(text);

    }
}
