import java.util.Scanner;

/**
 * Created by andrearaykova on 12/17/16.
 */
public class celsiustofahrenhai {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("celsius: ");
        double celsius = Double.parseDouble(console.nextLine());
        double fahrenhai =  (celsius * 9) / 5 + 32;
        System.out.println(fahrenhai);

    }
}
