import java.util.Scanner;

/**
 * Created by andrearaykova on 1/21/17.
 */
public class invalidnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
         if ((a >= 100 && a <=200) || a == 0 ) {
             System.out.println();

         } else {
             System.out.println("invalid");
         }
    }
}
