import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexmon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern patternBojomon = Pattern.compile("[A-Za-z]+-[A-Za-z]+");
        Pattern patternDidimon = Pattern.compile("[^a-zA-Z\\-]+");

        Matcher matcherBojomon = patternBojomon.matcher(input);
        Matcher matcherDidimon = patternDidimon.matcher(input);

        int bojoIndex = 0;
        int didiIndex = 0;
        while (true){
            boolean hasDMatch = false;
            boolean hasBMatch = false;
           if (hasDMatch = matcherDidimon.find(didiIndex)){
               bojoIndex = matcherDidimon.end();
               System.out.println(matcherDidimon.group());
           }
           if (!hasDMatch) {
               break;
           }if (hasBMatch = matcherBojomon.find(bojoIndex)){
                   didiIndex = matcherBojomon.end();
                   System.out.println(matcherBojomon.group());
               }if (!hasBMatch){
               break;
           }
        }
    }
}
