import java.util.Scanner;

/**
 * Created by andrearaykova on 2/18/17.
 */
public class evenpowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        System.out.println(num);

        for (int i = 0; i < n ; i++) {
            num *= 2;
            if (i % 2 != 0) {
                System.out.println(num);
            }


            
        }

    }
}
