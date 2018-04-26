import java.util.Scanner;

/**
 * Created by andrearaykova on 9/19/17.
 */
public class rectanglearea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double sum = width * height;
        System.out.printf("%.2f",sum);
    }
}
