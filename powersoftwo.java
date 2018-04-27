import java.util.Scanner;

/**
 * Created by andrearaykova on 2/18/17.
 */
public class powersoftwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        System.out.println(num);

        for (int i = 1; i <= n ; i++) {
            num = num * 2;
            System.out.println(num);

        }
    }
}
