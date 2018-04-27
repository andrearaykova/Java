import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrearaykova on 10/27/17.
 */
public class ExtractSentencesbyKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String[] input = scanner.nextLine().split("[.!?]");


        for (String sentence : input) {
            Pattern pattern = Pattern.compile("\\b" + word + "\\b");

            Matcher matcher = pattern.matcher(sentence);

            while (matcher.find()){

                System.out.println(sentence.trim());
            }
        }

    }
}
