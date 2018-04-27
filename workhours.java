import java.util.Scanner;

/**
 * Created by andrearaykova on 3/18/17.
 */
public class workhours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hourswork = workers * days * 8;



        if (hourswork >= hours) {
            int h = hourswork - hours;
            System.out.printf("%s hours left",h);
        } else {
            int h2 = hours - hourswork;
            int more = h2 * days;
            System.out.printf("%s overtime",h2);
            System.out.println();
            System.out.printf("Penalties: %s",more);
        }



    }
}
