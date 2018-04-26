import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by andrearaykova on 10/3/17.
 */
public class NumbersinReversedOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long result = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(text -> new StringBuilder(text).reverse().toString())
                .mapToInt(Integer::parseInt).sum();
        System.out.println(result);

       // int num = Integer.parseInt(scanner.nextLine());
       // int reversed = 0;
//
       // while (num != 0) {
       //     int digit = num % 10;
       //     reversed = reversed * 10 + digit;
       //     num /= 10;
       // }
//
       // System.out.println(reversed);




    }
}
