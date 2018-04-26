import java.util.Scanner;

/**
 * Created by andrearaykova on 1/14/17.
 */
public class greaternumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = Integer.parseInt(console.nextLine());
        int secondNumber = Integer.parseInt(console.nextLine());

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber );
        } else  {
            System.out.println(secondNumber );
        }

    }
}
