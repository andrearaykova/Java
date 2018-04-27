import java.util.Scanner;

/**
 * Created by andrearaykova on 9/29/17.
 */
public class BooleanVaeiable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        if (a.equals("True")) {
            System.out.println("Yes");
        } else if (a.equals("False")){
            System.out.println("No");
        }

    }
}
