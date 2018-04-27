import java.util.Scanner;

/**
 * Created by andrearaykova on 2/21/17.
 */
public class NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num ; i++) {
            for (int j = 0; j < num ; j++) {
               int currentNumber = i + j;
               if (currentNumber > num) {
                   currentNumber = 2 * num - currentNumber;
               }
                System.out.print(currentNumber + " ");
            }
            System.out.println();
        }
    }
}