import java.util.Scanner;

/**
 * Created by andrearaykova on 9/22/17.
 */
public class wordinplural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        if (input.endsWith("y")) {
           input = input.substring(0,input.length() - 1);
           input += "ies";
        } else  if (input.endsWith("o") || input.endsWith("ch") || input.endsWith("s")
                || input.endsWith("x") || input.endsWith("z") || input.endsWith("sh")) {

            input += "es";

        } else {
            input += "s";
        }
        System.out.println(input);

    }
}
