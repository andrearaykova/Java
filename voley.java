import java.util.Scanner;

/**
 * Created by andrearaykova on 1/23/17.
 */
public class voley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yearType = scanner.nextLine().toLowerCase();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsAtHome = Integer.parseInt(scanner.nextLine());
        int weekends = 48;
        double activeInSofia = (weekends - weekendsAtHome) * 0.75;
        double activeAtHolidays = (holidays * 2.0) / 3;
        double totalPlayedGames = activeInSofia + weekendsAtHome + activeAtHolidays;

        if (yearType.equals("normal")) {
            System.out.println((int)totalPlayedGames);
        } else if (yearType.equals("leap")) {
            totalPlayedGames *= 1.15;
            System.out.println((int) totalPlayedGames);
        }

    }
}
