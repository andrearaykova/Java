import java.util.Scanner;

/**
 * Created by andrearaykova on 10/2/17.
 */
public class SignofIntegerNumber {

    static void Number (int number) {

        if (number > 0) {
            System.out.println("The number " + number +  " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else if (number == 0) {
            System.out.println("The number 0 is zero.");
        }
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int num = Integer.parseInt(scanner.nextLine());

        Number(Integer.parseInt(scanner.nextLine()));

    }
}
