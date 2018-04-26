import java.util.Scanner;

/**
 * Created by andrearaykova on 10/5/17.
 */
public class ReverseanArrayofIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
           arr[i] = Integer.parseInt(scanner.nextLine());

        }
        for (int i = num - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");


        }
    }
}
