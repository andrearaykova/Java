import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class SoftUniCoffeeOrders {
    public static void main(String[] args) throws ParseException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        BigDecimal totalsum = new BigDecimal(0);

        for (int i = 0; i < num; i++) {


            BigDecimal pricePerCapsule = new BigDecimal(reader.readLine());
            LocalDate date = LocalDate.parse(reader.readLine(), dtf);
            int capsulesCount = Integer.parseInt(reader.readLine());
            int daysInMonth = getDaysOfMonth(date);
            BigDecimal currentOrderTotal = BigDecimal.valueOf(daysInMonth)
                    .multiply(BigDecimal.valueOf(capsulesCount))
                    .multiply(pricePerCapsule);

            System.out.printf("The price for the coffee is: $%.2f\n", currentOrderTotal);
            totalsum = totalsum.add(currentOrderTotal);
        }
        System.out.printf("Total: $%.2f", totalsum);

    }

    private static int getDaysOfMonth(LocalDate date) {

        if (date.getYear() % 4 == 0) {
            return date.getMonth().maxLength();
        } else {
            return date.getMonth().minLength();
        }
    }
}
