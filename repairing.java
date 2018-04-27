import java.util.Scanner;

/**
 * Created by andrearaykova on 3/9/17.
 */
public class repairing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N = Double.parseDouble(scanner.nextLine());
        double W = Double.parseDouble(scanner.nextLine());
        double L = Double.parseDouble(scanner.nextLine());
        double M = Double.parseDouble(scanner.nextLine());
        double O = Double.parseDouble(scanner.nextLine());

        double cqlaplosht = N * N;
        double ploshtpeika = M * O;
        double ploshtpokrivane = cqlaplosht - ploshtpeika;
        double ploshtplochki = W * L;
        double plochki = ploshtpokrivane / ploshtplochki;
        double time = plochki * 0.2;

        System.out.println(plochki);
        System.out.println(time);
    }
}
