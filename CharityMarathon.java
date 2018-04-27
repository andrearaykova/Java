import java.util.Scanner;

/**
 * Created by andrearaykova on 11/1/17.
 */
public class CharityMarathon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenghtMarathon = Integer.parseInt(scanner.nextLine());
        double numberOfRunners = Integer.parseInt(scanner.nextLine());
        int averageNumber = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        double moneyPerKm = Double.parseDouble(scanner.nextLine());

        double totalCapacity = capacity * lenghtMarathon;
        if (totalCapacity <= numberOfRunners) {
            numberOfRunners = totalCapacity;
            double totalMetres = numberOfRunners * averageNumber * lenght;
            double totalKilom = totalMetres / 1000;
            double raisedMoney = totalKilom * moneyPerKm;
            System.out.printf("Money raised: %.2f", raisedMoney);
        } else {
            double totalMetres = numberOfRunners * averageNumber * lenght;
            double totalKilom = totalMetres / 1000;
            double raisedMoney = totalKilom * moneyPerKm;
            System.out.printf("Money raised: %.2f", raisedMoney);
        }
    }
}
