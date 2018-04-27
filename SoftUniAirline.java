import java.util.Scanner;

/**
 * Created by andrearaykova on 11/1/17.
 */
public class SoftUniAirline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double profit = 0;
        double totalProfit = 0;
        for (int i = 0; i < n ; i++) {


            int adultPassengersCount = Integer.parseInt(scanner.nextLine());
            double adultTicketPrice = Double.parseDouble(scanner.nextLine());
            int youthPassengersCount = Integer.parseInt(scanner.nextLine());
            double youthTicketPrice = Double.parseDouble(scanner.nextLine());
            double fuelPrice = Double.parseDouble(scanner.nextLine());
            double fuelConsumption = Double.parseDouble(scanner.nextLine());
            int flightDuration = Integer.parseInt(scanner.nextLine());

            double income = (adultPassengersCount * adultTicketPrice)
                    + (youthPassengersCount * youthTicketPrice);
            double espenses = flightDuration * fuelConsumption * fuelPrice;

            profit = income - espenses;
            if (income >= espenses) {
                System.out.printf("You are ahead with %.3f$.\n",profit);
            } else {
                System.out.printf("We've got to sell more tickets! We've lost %.3f$.\n",profit);
            }
            totalProfit += profit;
        }
        System.out.printf("Overall profit -> %.3f$.\n",totalProfit);
        System.out.printf("Average profit -> %.3f$.\n",totalProfit/n);
    }
}
