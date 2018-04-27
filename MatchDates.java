import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrearaykova on 10/26/17.
 */
public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b((\\d{2})(\\/|-|.)([A-Z]{1}[a-z]{2})\\3(\\d{4}))\\b");
        Matcher matcher = pattern.matcher(input);



        while (matcher.find()){
            System.out.print("Day: " + matcher.group(2) +
            ", Month: " + matcher.group(4) +
            ", Year: " + matcher.group(5));
            System.out.println();

        }


    }
}
