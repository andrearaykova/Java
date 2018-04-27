import java.util.Scanner;

/**
 * Created by andrearaykova on 9/28/17.
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Hello, " + firstname + " " + lastname + "." +
        "You are " + age + " years old.");
    }
}
