import java.util.Scanner;

/**
 * Created by andrearaykova on 9/21/17.
 */
public class backin30min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min =   Integer.parseInt(scanner.nextLine());

        min = min + 30;



        if (min > 59) {

            hours += 1;


         if (hours > 23) {
             hours = 0;

         }

         min -= 60;


         }
            System.out.printf("%d:%02d" ,hours,min);
        }

}
