import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrearaykova on 10/27/17.
 */
public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, TreeMap<Double, String>> text = new TreeMap<>();
        while (true) {
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile("([A-Z]{2})(\\d+.\\d+)([^|]+)\\|.*");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                if (!text.containsKey(matcher.group(1))) {
                    text.put(matcher.group(1), new TreeMap<>());
                }
                text.get(matcher.group(1)).put(Double.parseDouble(matcher.group(2)), matcher.group(3));

            }
            if (input.equals("end")) {
                break;
            }
        }

        for (String s : text.keySet()) {
            System.out.print(s + " => ");

            Double ostanalaChast = text.get(s).lastKey();

            System.out.printf("%.2f => ", ostanalaChast);

            System.out.printf("%s\n", text.get(s).get(ostanalaChast));
        }

    }
}
