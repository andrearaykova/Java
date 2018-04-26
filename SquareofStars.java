import java.util.Scanner;

/**
 * Created by andrearaykova on 12/13/16.
 */
public class SquareofStars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Enter Square size
        int n = scan.nextInt();
        while (!(2 <= n && n <= 100)) {
            n = scan.nextInt();
        }

        //Square top/bottom and sides
        String star = new String(new char[n]).replace("\0", "*");
        String space = new String(new char[n - 2]).replace("\0", " ");

        //Draw square
        for (int i = 1; i <= n; i++) {
            if (!(i == 1 || i == n)) {
                System.out.println("*" + space + "*");
            } else {
                System.out.println(star);
            }

        }
    }
}

