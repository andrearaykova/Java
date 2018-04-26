import java.util.Scanner;

/**
 * Created by andrearaykova on 12/17/16.
 */
public class Radianstodegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("rad: ");
        double rad = Double.parseDouble(console.nextLine());
        double deg = (rad * 180)/ Math.PI ;
        System.out.println(deg);

    }
}
