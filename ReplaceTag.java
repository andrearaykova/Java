import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;

/**
 * Created by andrearaykova on 10/26/17.
 */
public class ReplaceTag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String patern = "<a.*?href.*?=(.*)>(.*?)<\\/a>";
            String replacement = "[URL href=$1]$2[/URL]";
            String replaced = input.replaceAll(patern,replacement);

            System.out.println(replaced);
            input = scanner.nextLine();
        }
    }
}
