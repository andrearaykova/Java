import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by andrearaykova on 9/29/17.
 */
public class ConvertSpeedUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float meters = Float.parseFloat(scanner.nextLine());
        float hours =  Float.parseFloat(scanner.nextLine());
        float min =  Float.parseFloat(scanner.nextLine());
        float sec =  Float.parseFloat(scanner.nextLine());

        float time = ((hours * 3600) + (min * 60) + sec);

        float meterPerSec = meters / time;
        float kilometersPerHour = (meters / 1000) / (time / 3600);
        float milesPerHour = (meters/1609) / (time/3600);



        System.out.printf("%.6f\n",meterPerSec);
        System.out.printf("%.6f\n",kilometersPerHour);
        System.out.printf("%.6f\n",milesPerHour);

    }

}
