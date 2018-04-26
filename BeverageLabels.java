import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by andrearaykova on 9/19/17.
 */
public class BeverageLabels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double volume = Double.parseDouble(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double sugar =  Double.parseDouble(scanner.nextLine());
        energy = (volume * energy * 1.0) / 100;
        sugar = (volume * sugar * 1.0) / 100;
        DecimalFormat newFormat = new DecimalFormat("#.################");

        System.out.println(newFormat.format(volume) + "ml " + name + ":");
        System.out.printf(newFormat .format(energy) + "kcal, " + newFormat.format(sugar) + "g sugars");

    }
}
