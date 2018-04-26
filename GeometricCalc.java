import java.util.Scanner;

/**
 * Created by andrearaykova on 10/3/17.
 */
public class GeometricCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        if (figure.equals("triangle")) {
            double area = (first * second) / 2;
            System.out.printf("%.2f",area);
        } else if (figure.equals("square")) {
            double area = first * second;
            System.out.printf("%.2f",area);
        } else if (figure.equals("rectangle")) {
            double area = first * second;
            System.out.printf("%.2f",area);
        } else if (figure.equals("circle")) {
            double area = first * second * Math.PI;
            System.out.printf("%.2f",area);
        }
    }
}
