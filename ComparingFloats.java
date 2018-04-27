import java.util.Scanner;

/**
 * Created by andrearaykova on 9/30/17.
 */
public class ComparingFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float numA = Float.parseFloat(scanner.nextLine());
        float numB = Float.parseFloat(scanner.nextLine());

        float c = numA - numB;
        float d = numB - numA;

        if (c > 0.000001) {
            System.out.println("False");


        } else if (d > 0.000001) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}