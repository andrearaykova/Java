import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by andrearaykova on 9/29/17.
 */
public class CenturiestNanoseconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        int days = (int) (years * 365.2422);
        int hours = days * 24;
        int min = hours * 60;
        long sec = min * 60L;
        BigDecimal hunder = new BigDecimal(1000);
       BigDecimal milisec =  new BigDecimal(sec * 1000);
       BigDecimal microsec = BigDecimal.ONE;
       BigDecimal nanosec =  BigDecimal.ONE;
       microsec = milisec.multiply(hunder);
       nanosec = microsec.multiply(hunder);



        System.out.print(centuries + " centuries = ");
        System.out.print(years + " years = ");
        System.out.print(days + " days = ");
        System.out.print(hours + " hours = ");
        System.out.print(min + " minutes = ");
        System.out.print(sec + " seconds = ");
       System.out.print(milisec + " milliseconds = ");
       System.out.print(microsec + " microseconds = ");
       System.out.print(nanosec + " nanoseconds");

    }
}
