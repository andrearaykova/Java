import java.util.Scanner;

/**
 * Created by andrearaykova on 9/22/17.
 */
public class Intervalofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       int a = Integer.parseInt(scanner.nextLine());
       int b = Integer.parseInt(scanner.nextLine());


       if (a < b) {
           for (int i = a; i <= b; i++) {
               System.out.println(i);


           }
       } else if (b < a) {

           for (int i = b; i <= a ; i++) {
            System.out.println(i);
        }
        }
    }
}
