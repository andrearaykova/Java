import java.util.Scanner;

/**
 * Created by andrearaykova on 9/21/17.
 */
public class trycatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        try {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("It is a number.");
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }

    }
}
