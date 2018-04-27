import java.util.Scanner;

/**
 * Created by andrearaykova on 3/15/17.
 */
public class histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 200) p1++;
            else if (num < 400) p2++;
            else if (num < 600) p3++;
            else if (num < 800) p4++;
            else p5++;

            }
            double p1percent = p1 * 100.0 / n;
            double p2percent = p2 * 100.0 / n;
            double p3percent = p3 * 100.0 / n;
            double p4percent = p4 * 100.0 / n;
            double p5percent = p5 * 100.0 / n;

        System.out.printf("%.2f",p1percent);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f",p2percent);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f",p3percent);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f",p4percent);
        System.out.print("%");
        System.out.println();
        System.out.printf("%.2f",p5percent);
        System.out.print("%");
        System.out.println();

        }
    }

