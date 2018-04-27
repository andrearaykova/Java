import java.util.Scanner;

/**
 * Created by andrearaykova on 9/29/17.
 */
public class ExchangeVariableValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        int b = 10;
        System.out.println("Before:");
        System.out.println("a = " + a );
        System.out.println("b = " + b );
        System.out.println("After:");
        System.out.println("a = " + b);
        System.out.println("b = " + a);
    }
}
