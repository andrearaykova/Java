import java.util.Scanner;

/**
 * Created by andrearaykova on 2/18/17.
 */
public class from1to100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Еnter a number in the range [1...100]: ");

        int n = Integer.parseInt(scanner.nextLine());


         while (true) {
             if (n  < 1 || n > 100) {
                 System.out.println("Invalid number!");
                 System.out.println("Еnter a number in the range [1...100]: ");
                 n = Integer.parseInt(scanner.nextLine());
             } else {
                 System.out.println("The number is: " + n);
                 break;
             }
         }

    }
}
