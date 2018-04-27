import java.util.Scanner;

/**
 * Created by andrearaykova on 9/22/17.
 */
public class caloriescounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int cheese = 0;
        int tomatosauce = 0;
        int salami = 0;
        int pepper = 0;

        for (int i = 0; i < n; i++) {

            String product = scanner.nextLine().toLowerCase();

            if (product.equals("cheese")){
                cheese++;
            }
            if (product.equals("tomato sauce")) {
                tomatosauce++;
            }
            if (product.equals("salami")) {
                salami++;
            }
            if (product.equals("pepper")){
                pepper++;
            }
        }
        System.out.println("Total calories: " +((cheese*500) + (tomatosauce*150) + (salami*600) + (pepper*50)));


    }
}
