import java.util.Scanner;

/**
 * Created by andrearaykova on 10/1/17.
 */
public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstRange = Integer.parseInt(scanner.nextLine());
        int secondRange = Integer.parseInt(scanner.nextLine());

        for (int i = firstRange; i <= secondRange ; i++) {
            System.out.print((char)i + " ");

        }
    }
}
