import java.util.Scanner;

/**
 * Created by andrearaykova on 1/22/17.
 */
public class forv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        if (product.equals("banana") || product.equals("apple") || product.equals("kiwi")
            || product.equals("cherry") || product.equals("lemon") || product.equals("grapes")) {
            System.out.println("fruit");
        } else if (product.equals("tomato") || product.equals("cucumber") || product.equals("pepper")
                || product.equals("carrot") ) {
            System.out.println("vegetable");

        } else {
            System.out.println("unknown");
        }
    }

}
