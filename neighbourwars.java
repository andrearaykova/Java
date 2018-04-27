import java.util.Scanner;

/**
 * Created by andrearaykova on 9/22/17.
 */
public class neighbourwars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peshoDamage = Integer.parseInt(scanner.nextLine().trim());
        int goshoDamage = Integer.parseInt(scanner.nextLine().trim());
        int peshoHealth = 100;
        int goshoHealth = 100;
        int turn = 0;

        while (peshoHealth > 0 && goshoHealth > 0) {
            turn ++;
            if (turn % 2 != 0) {
                goshoHealth -= peshoDamage;
                if (goshoHealth < 1) {
                    System.out.println("Pesho won in " + turn + "th round.");
                    break;
                }
                System.out.printf("Pesho used Roundhouse kick and reduced Gosho to %d health.", goshoHealth);
                System.out.println();

            } else {
                peshoHealth -= goshoDamage;
                if (peshoHealth < 1) {
                    System.out.printf("Gosho won in %dth round.", turn);
                    System.out.println();
                    break;
                }
                System.out.printf("Gosho used Thunderous fist and reduced Pesho to %d health.", peshoHealth);
                System.out.println();

            }
            if (turn % 3 == 0) {
                peshoHealth += 10;
                goshoHealth += 10;
            }
        }

    }
}
