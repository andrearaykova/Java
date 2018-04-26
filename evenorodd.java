import java.util.Scanner;

/**
 * Created by andrearaykova on 1/14/17.
 */
public class evenorodd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        boolean even = (a % 2 == 0);


        if (even == true) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}