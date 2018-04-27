import java.util.Scanner;

/**
 * Created by andrearaykova on 9/22/17.
 */
public class counttheintegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        try {
            while (true) {
                int input = Integer.parseInt(scanner.nextLine());
                counter++;
            }
        }
        catch (Exception e) {
            System.out.println(counter);
        }

    }
}
