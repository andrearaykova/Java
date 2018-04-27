import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrearaykova on 10/26/17.
 */
public class MatchPhoneNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        String pat = "\\+359(\\s|-)2\\1\\d{3}\\1\\d{4}\\b";

        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(number);

        ArrayList<String> matches = new ArrayList<>();

        while (matcher.find()){
            matches.add(matcher.group());
        }
        System.out.println(String.join(", ", matches.toString().replaceAll("[\\[\\]]", "")));

    }
}

