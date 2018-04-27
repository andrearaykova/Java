import java.util.Scanner;

/**
 * Created by andrearaykova on 3/5/17.
 */
public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double workDays = Double.parseDouble(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double dollarLev = Double.parseDouble(scanner.nextLine());

        double result = workDays * price;
        result = (result * 12) + (result * 2.5);
        result = result - (result * 0.25) ;
        result = result * dollarLev;
        result = result / 365;
        System.out.printf("%.2f",result);
    }
}
