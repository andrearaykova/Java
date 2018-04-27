import java.util.Scanner;

/**
 * Created by andrearaykova on 3/14/17.
 */
public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                p1++;
            }  if (number % 3 == 0) {
            p2++;
        }
         if (number % 4 == 0){
                p3++;
            }

        }
        System.out.printf("%.2f",p1 / n * 100 );
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f",p2 / n * 100 );
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f",p3 / n * 100 );
        System.out.print("%");


    }
}
