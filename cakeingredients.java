import java.util.Scanner;

/**
 * Created by andrearaykova on 9/22/17.
 */
public class cakeingredients {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ingr = scanner.nextLine();

        for (int i = 0; i <= 20 ; i++) {


            if (!ingr.equals("Bake!")) {
                System.out.println("Adding ingredient " + ingr + ".");
                ingr = scanner.nextLine();
            } else {
                System.out.println("Preparing cake with " + i + " ingredients.");
                break;
            }

        }


    }
}
