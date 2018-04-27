import java.util.Scanner;

/**
 * Created by andrearaykova on 1/22/17.
 */
public class smallshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine().toLowerCase();
        String town = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (town.equals("sofia")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.5);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.8);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.2);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.45);
            } else if  (product.equals("peanuts")) {
                System.out.println(quantity * 1.6);
            }

        } else if (town.equals("plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.4);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.7);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.15);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.3);
            } else if  (product.equals("peanuts")) {
                System.out.println(quantity * 1.5);
            }

        } else  {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.45);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.7);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.1);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.35);
            } else if  (product.equals("peanuts")) {
                System.out.println(quantity * 1.55);
            }
        }

    }
}
