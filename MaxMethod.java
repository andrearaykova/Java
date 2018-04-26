import java.util.Scanner;

/**
 * Created by andrearaykova on 10/3/17.
 */
public class MaxMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int result = Math.max(Math.max(num,num1),num2);

        System.out.println(result);




    }


}
