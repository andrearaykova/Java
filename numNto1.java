import java.util.Scanner;

/**
 * Created by andrearaykova on 2/18/17.
 */
public class numNto1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1; i--) {
            System.out.println(i);

        }

    }
}
