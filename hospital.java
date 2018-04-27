import java.util.Scanner;

/**
 * Created by andrearaykova on 3/5/17.
 */
public class hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int treated = 0;
        int unTreated = 0;
        int doctors = 7;
        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if ((i % 3 == 0) && (unTreated > treated)) {
                doctors++;

            } if ( patients <= doctors) {
                treated += patients;
            } else  {
                treated += doctors;
                unTreated += (patients - doctors);
            }

        }
        System.out.printf("Treated patients: %d.\n",treated);
        System.out.printf("Untreated patients: %d.\n",unTreated);



    }
}
