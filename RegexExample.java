import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrearaykova on 10/26/17.
 */
public class RegexExample {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("your regex here");
        Pattern pattern = Pattern.compile("\\w+");
//        Matcher matcher = pattern.matcher("your input");
        Matcher matcher = pattern.matcher("your input");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
