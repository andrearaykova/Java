import java.util.Scanner;

/**
 * Created by andrearaykova on 3/8/17.
 */
public class matchticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        String kat = scanner.nextLine();
        double people = Double.parseDouble(scanner.nextLine());

        double ticketPrice = kat == "VIP" ? 499.99 : 249.99;
        double moneyleft = money;
        if (people < 5)
        {
            moneyleft -= money * 0.75;
        }
        else if (people >=5 && people < 10)
        {
            moneyleft -= money * 0.60;
        }
        else if (people >= 10 && people < 25)
        {
            moneyleft -= money * 0.50;
        }
        else if (people >= 25 && people < 50)
        {
            moneyleft -= money * 0.40;
        }
        else
        {
            moneyleft -= money * 0.25;
        }
        double all = people * ticketPrice;
        if (all > moneyleft) {
            System.out.printf("Not enough money! You need %s leva.", Math.ceil(all - moneyleft));

        } else {
            moneyleft -= all;
            System.out.printf("Yes! You have %s leva left.", Math.ceil(moneyleft));
        }



    }
}




