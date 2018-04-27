import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by andrearaykova on 9/28/17.
 */
public class circlearea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());
         BigDecimal area = BigDecimal.valueOf(Math.PI * radius * radius);


        System.out.printf("%.12f",area);
    }
}
