import java.util.Scanner;

/**
 * Created by andrearaykova on 12/17/16.
 */
public class CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rad = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * rad * rad;
        double perimeter  = 2 * Math.PI * rad;

        System.out.println(area);
        System.out.println(perimeter);
    }
}
