import java.util.Scanner;

/**
 * Created by andrearaykova on 9/22/17.
 */
public class gameofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matchCounter = 0;
        int sum = 0;
        int counter = 0;
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int magicnumber = Integer.parseInt(scanner.nextLine());

        for (int i = m; i >= n ; i--) {
            for (int j = m; j >= n ; j--) {
                sum = i + j;
                counter++;
                if (sum == magicnumber) {
                    System.out.println("Number found! " + i + " + " + j + " = " + magicnumber);
                    matchCounter++;
                    return;
                }


            }

        }
        if (matchCounter == 0) {
            System.out.println(counter + " combinations - neither equals " + magicnumber);
        }
    }
}
