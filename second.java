
import java.util.Scanner;

/**
 * Created by andrearaykova on 3/5/17.
 */
public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double V = Double.parseDouble(scanner.nextLine());
        double P1 = Double.parseDouble(scanner.nextLine());
        double P2 = Double.parseDouble(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double result = (P1 * H) + (P2 * H);

        if (result <= V) {
            double percent = Math.floor((result / V) * 100);
            double p1 = Math.floor(((P1 * H) / result) * 100);
            double p2 = Math.floor(((P2 * H) / result) * 100);
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.",percent,p1,p2);

        } else {
            double overflows = result - V;
            System.out.printf("For %.1f hours the pool overflows with %.0f liters.",H,overflows);

        }
    }
}
