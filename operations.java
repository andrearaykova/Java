import java.util.Scanner;

/**
 * Created by andrearaykova on 3/9/17.
 */
public class operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        if (symbol.equals("+")) {
            int result = N1 + N2;
            System.out.print((N1 + " + " + N2) + " = " + result + " - ");
            System.out.println((N1 + N2) % 2 == 0 ? "even" : "odd");
        } else if (symbol.equals(" - ")) {
            int result = N1 - N2;
            System.out.print((N1 + " - " + N2) + " = " + result + (" - "));
            System.out.println((N1 + N2) % 2 == 0 ? "even" : "odd");
        } else if (symbol.equals("*")) {
            int result = N1 * N2;
            System.out.print((N1 + " * " + N2) + " = " + result + " - ");
            System.out.println((N1 + N2) % 2 == 0 ? "even" : "odd");
        } else if (symbol.equals("/")) {
            int result = N1 / N2;
            System.out.printf((N1 + " / " + N2) + " = " + "%.2f",result);
        } else if (symbol.equals("%")) {
            int result = N1 % N2;
            System.out.print((N1 + " % " + N2) + " = " + result );
        } else if (symbol.equals("/") || symbol.equals("%") && N2 == 0){
            System.out.printf("Cannot divide %s by zero",N1);

        }
    }
}