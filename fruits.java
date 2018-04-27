import java.util.Scanner;

/**
 * Created by andrearaykova on 1/21/17.
 */
public class fruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = -1.0;


        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday")
            || day.equals("friday") ) {
            if (fruit.equals("banana")) price = 2.50;
            else if (fruit.equals("apple")) price = 1.20;
            else if (fruit.equals("orange")) price = 0.85;
            else if (fruit.equals("grapefruit")) price =1.45;
            else if (fruit.equals("kiwi")) price = 2.70;
            else if (fruit.equals("pineapple")) price = 5.50;
            else if (fruit.equals("grapes")) price = 3.85;
        } else if (day.equals("saturday") || day.equals("sunday")) {
            if (fruit.equals("banana")) price = 2.70;
             if (fruit.equals("apple")) price = 1.25;
             if (fruit.equals("orange")) price = 0.90;
             if (fruit.equals("grapefruit")) price = 1.60;
             if (fruit.equals("kiwi")) price = 3.00;
             if (fruit.equals("pineapple")) price = 5.60;
             if (fruit.equals("grapes")) price = 4.20;

        } else {
            System.out.println("error");
        } if (price >= 0 ) {
            System.out.println(price * quantity);
        } else {
            System.out.println("error");
        }

    }
}
