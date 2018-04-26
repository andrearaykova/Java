import java.util.Scanner;

/**
 * Created by andrearaykova on 9/19/17.
 */
public class characterstats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int health = Integer.parseInt(scanner.nextLine());
        int maxh = Integer.parseInt(scanner.nextLine());
        int energy = Integer.parseInt(scanner.nextLine());
        int maxe = Integer.parseInt(scanner.nextLine());


        System.out.println("Name: " + name);
        System.out.println("Health: " + "|" + doMagic("|",health) + doMagic(".", maxh - health) + "|");
        System.out.println("Energy: " + "|" + doMagic("|",energy) + doMagic(".", maxe - energy) + "|");
    }

    public static String doMagic(String text, int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;

        }
        return output;
    }
}
