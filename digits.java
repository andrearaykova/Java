import java.util.Scanner;

/**
 * Created by andrearaykova on 3/5/17.
 */
public class digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int first = n/100;
        int second = (n/10) % 10;
        int third = n % 10;
        for (int i = 0; i < first + second; i++) {
            for (int j = 0; j < first + third; j++) {
                if (n % 5 == 0) {
                    n -= first;
                    System.out.print(n + " ");
                } else if (n % 3 == 0) {
                    n -= second;
                    System.out.print(n + " ");
                } else {
                    System.out.print((n += third) + " ");
                }

            }
            System.out.println();

        }
    }
}
