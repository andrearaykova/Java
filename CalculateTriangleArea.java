import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by andrearaykova on 10/2/17.
 */
public class CalculateTriangleArea {

    static double Area (double width,double height) {
        return width * height / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = Area(width,height);
        System.out.println((area));
    }
}
