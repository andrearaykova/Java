import java.util.Scanner;

/**
 * Created by andrearaykova on 10/2/17.
 */
public class TemperatureConversion {

    static double FahrenheitToCelsium (double fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9) ;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fahrenheit = Double.parseDouble(scanner.nextLine());
        double celsium = FahrenheitToCelsium(fahrenheit);
        System.out.printf("%.2f",celsium);


    }
}
