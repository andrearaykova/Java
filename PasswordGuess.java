import java.util.Scanner;

/**
 * Created by andrearaykova on 1/16/17.
 */
public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parola = "s3cr3t!P@ssw0rd";
        String user = scanner.nextLine();

        if (user.equals(parola)) {
            System.out.println("Welcome");

            } else
            System.out.println("Wrong password!");
        }
    }

