import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrearaykova on 11/1/17.
 */
public class NetherRealms {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> demonStatistics = new TreeSet<>();

        String[] demons = reader.readLine().split("\\s*,\\s*");
        String healthRegex = "[^0-9+\\-*/.]";
        String damageRegex = "-?\\d+(\\.\\d+)?";
        String operatorsRegex = "[*/]";
        Pattern healthPattern = Pattern.compile(healthRegex);
        Pattern damagePattern = Pattern.compile(damageRegex);
        Pattern operatorsPattern = Pattern.compile(operatorsRegex);

        for (String demon : demons) {
            long health = 0;
            double damage = 0;
            Matcher healthMatcher = healthPattern.matcher(demon);
            while (healthMatcher.find()) {
                health += healthMatcher.group(0).charAt(0);
            }
            Matcher damageMatcher = damagePattern.matcher(demon);
            while (damageMatcher.find()) {
                damage += Double.parseDouble(damageMatcher.group(0));
            }
            Matcher operatorsMatcher = operatorsPattern.matcher(demon);
            while (operatorsMatcher.find()) {
                String match = operatorsMatcher.group(0);
                if (match.equals("*")) {
                    damage *= 2;
                } else {
                    damage /= 2;
                }
            }
            demonStatistics.add(String.format("%s - %d health, %.2f damage", demon, health, damage));
        }
        for (String demonStatistic : demonStatistics) {
            System.out.println(demonStatistic);
        }
    }
}


