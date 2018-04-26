import java.util.Scanner;

/**
 * Created by andrearaykova on 12/17/16.
 */
public class Greetingbyname {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print ("");
        String name = console.nextLine();
        System.out.printf("Hello, " + name + "!");
    }

}
