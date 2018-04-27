import java.util.Scanner;

/**
 * Created by andrearaykova on 1/23/17.
 */
public class pif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        if (x > 0 && x < h) {
            if (y > 0 && y < h) {
                System.out.println("Inside");
            } else if (y == 0 || y == h) {
                System.out.println("Border");
            } else {
                System.out.println("Outside");
            }

        } else if (x == 0) {
            if (y >= 0 && y <= h) {
                System.out.println("Border");

            } else {
                System.out.println("Outside");
            }
        }
        if (x > h && x < 2 * h) {
            if (y > 0 && y < 4 * h) {
                System.out.println("Inside");
                ;
            } else if (y == 0 || y == 4 * h) {

                System.out.println("Border");
            } else {
                System.out.println("Outside");
            }

        } else if (x == h || x == 2 * h) {
            if (y > 0 && y < h) {
                System.out.println("Inside");
            } else if (y == 0 || y == h) {
                System.out.println("Border");
            } else if (y > h && y <= 4 * h) {
                System.out.println("Border");
            } else {
                System.out.println("Outside");
            }
        } else {

            if (x > 2 * h && x < 3 * h) {
                if (y > 0 && y < h) {
                    System.out.println("Inside");
                } else if (y == 0 || y == h) {
                    System.out.println("Border");
                } else {
                    System.out.println("Outside");
                }

            } else if (x == 3 * h) {
                if (y >= 0 && y <= h) {
                    System.out.println("Border");
                } else {
                    System.out.println("Outside");
                }

            } else {
                System.out.println("Outside");
            }


        }
    }
}



