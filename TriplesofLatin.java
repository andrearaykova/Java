import java.util.Scanner;

/**
 * Created by andrearaykova on 9/28/17.
 */
public class TriplesofLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (char i = 'a'; i < 'a' + n ; i++) {
            for (char j = 'a'; j < 'a' + n; j++) {
                for (char k = 'a'; k < 'a' + n; k++) {
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    System.out.println();

                }

            }

        }
    }
}
