import java.util.Scanner;

/**
 * Created by andrearaykova on 1/16/17.
 */
public class AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String f = scanner.nextLine();

        double a = Double.parseDouble(scanner.nextLine());



        if (f.equals("square")) {
            double area = a*a;
            System.out.println(area);
        } else if (f.equals("rectangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            double area = a*b;
            System.out.println(area);
        }else if (f.equals("circle")) {
            double area = (a*a)*Math.PI;
            System.out.println(area);
        } else if (f.equals("triangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            double area = (a*b)*0.5;
            System.out.println(area);
        }
    }
}
