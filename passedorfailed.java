import java.util.Scanner;

/**
 * Created by andrearaykova on 9/21/17.
 */
public class passedorfailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3.00) {
            System.out.println("Passed!");
        }
        else {
            System.out.println("Failed!");
        }

    }
}
