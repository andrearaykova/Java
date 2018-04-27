import java.util.Scanner;

/**
 * Created by andrearaykova on 9/28/17.
 */
public class CenturiestoMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());
        long years = centuries * 100;
        long days = (int) (years * 365.2422);
        long hours = 24 * days;
        long min = 60 * hours;

        System.out.println(centuries);
        System.out.println(years);
        System.out.println(days);
        System.out.println(hours);
        System.out.println(min);
    }
}
