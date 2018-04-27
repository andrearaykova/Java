import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrearaykova on 11/5/17.
 */
public class Trainegram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("^(\\<\\[[^A-Za-z0-9]*\\][\\.]{1})+([\\.]{1}\\[[A-Za-z0-9]*\\][\\.]{1})*$");

        while (!input.equals("Traincode")){

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }

            input = scanner.nextLine();
        }
    }
}
