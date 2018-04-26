import java.util.Scanner;

/**
 * Created by andrearaykova on 12/17/16.
 */
public class SimpleCalculations {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.print("inches: ");
        double inches=Double.parseDouble(console.nextLine());
        double centimeters=inches * 2.54;
        System.out.println("centimeters= " + centimeters);

    }

}
