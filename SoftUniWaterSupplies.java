import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by andrearaykova on 11/1/17.
 */
public class SoftUniWaterSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = Integer.parseInt(scanner.nextLine());
        double[] bottles = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToDouble(Double::valueOf)
                .toArray();
        int capacity = Integer.parseInt(scanner.nextLine());
    }
}
