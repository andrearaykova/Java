import java.util.Scanner;

/**
 * Created by andrearaykova on 2/20/17.
 */
public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = -1;
        while (true) {
            try {
                a = Integer.parseInt(scanner.nextLine());
                if (a % 2 != 0) {
                    System.out.println("Invalid number!");
                } else {
                    System.out.println(a);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid number!");
            }


        }
    }
}
