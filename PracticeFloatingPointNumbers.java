import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by andrearaykova on 9/29/17.
 */
public class PracticeFloatingPointNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal num1 = new BigDecimal("3.141592653589793238");
        double num2 = 1.60217657;
        BigDecimal num3 = new BigDecimal("7.8184261974584555216535342341");

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
