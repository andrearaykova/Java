import java.util.Scanner;

/**
 * Created by andrearaykova on 1/16/17.
 */
public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int one = Integer.parseInt(scanner.nextLine());
         int two = Integer.parseInt(scanner.nextLine());
         int three = Integer.parseInt(scanner.nextLine());

         if ((one == two) && (one == three) && (two == three)) {
             System.out.println("yes");

         } else
             System.out.println("no");
    }
}
