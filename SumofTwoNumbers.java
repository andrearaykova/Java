
import com.sun.javafx.css.Combinator;

import java.util.Scanner;

/**
 * Created by andrearaykova on 3/18/17.
 */
public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int result = 0;
        boolean stoped = false;


        for (int i = first; i <= last; i++) {
            for (int j = first; j <= last; j++) {

                count++;
                result = i + j;

                if (result == magic) {

                    System.out.printf("Combination N:%d ", count);
                    System.out.printf("(%d + %d = %d)", i, j, result);
                    stoped = true;
                    break;
                }

            }
              if (stoped == true) {

                break;


               }
            }
            if (stoped == false) {
                System.out.printf("%d combinations - neither equals %d", count,magic);
        }

    }
}











