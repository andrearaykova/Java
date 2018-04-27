import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by andrearaykova on 9/29/17.
 */
public class RectangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double perimeter = 2 * width + (2 * height);
        double area = width * height;
        double diagonal = Math.sqrt(width *width + (height * height));
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println(df.format(perimeter));
        System.out.println(df.format(area));
        System.out.printf("%.13f",diagonal);
    }
}
