import java.util.Scanner;

/**
 * Created by andrearaykova on 2/7/17.
 */
public class oddevensum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int even = 0;
        int odd = 0;
        for (int i = 0; i <n ; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (i%2 == 0) {
                odd += a;

            }else {
                even += a;
            }


        } if (even ==odd) {
            System.out.println("Yes");
            System.out.println("Sum=" + even);
        } else {
            int result = Math.abs(even - odd);
            System.out.println("No");
            System.out.println("Diff = " + result);
        }

    }
}
