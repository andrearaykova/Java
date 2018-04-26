import java.math.BigDecimal;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by andrearaykova on 10/5/17.
 */
public class RoundingNumbersAwayfromZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String[] items = scanner.nextLine().split(" ");

       if ((items.equals("0"))) {
        for (int i = 0; i < items.length ; i++) {

            double num = Double.parseDouble(items[i]);
            BigDecimal roundedNum = new BigDecimal(num);
            roundedNum.setScale(0, BigDecimal.ROUND_CEILING);
            System.out.println(num + " => " +
                    Math.round(roundedNum.doubleValue()));

        }







    }
}}
