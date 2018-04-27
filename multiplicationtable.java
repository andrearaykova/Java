import java.util.Scanner;

/**
 * Created by andrearaykova on 9/21/17.
 */
public class multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int times = 1;

        while (times <= 10) {
            System.out.println(number + " X " + times +  " = " + number*times );
            times ++;
        }
    }
}
