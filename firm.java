import java.util.Scanner;

/**
 * Created by andrearaykova on 3/5/17.
 */
public class firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hours = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());

        double workHours = ((days - (days * 0.10)) * 8) + (workers * (2 * days));
        workHours = Math.floor(workHours);



        if (hours <= workHours) {
            System.out.printf("Yes!%.0f hours left.",workHours - hours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.",hours - workHours);
        }
    }
}
