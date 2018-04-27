import java.util.Scanner;

/**
 * Created by andrearaykova on 9/21/17.
 */
public class multiplicationtable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        do {
            System.out.println(number + " X "  + times + " = " + number*times);
            times++;
        }
        while (times <= 10);

    }

}
