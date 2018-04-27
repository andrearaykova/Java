import java.util.Scanner;

/**
 * Created by andrearaykova on 3/14/17.
 */
public class trip {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double budjet = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();


        double budjet1 = budjet * 30 / 100;
        double budjet2 = budjet * 70 / 100;
        double budjet3 = budjet * 40 / 100;
        double budjet4 = budjet * 80 / 100;
        double budjet5 = budjet * 90 / 100;

        if (budjet <= 100 && season.equals("summer")) {
            System.out.println("Somewhere in Bulgaria");
            System.out.print("Camp - ");
            System.out.printf("%.2f", budjet1);

        } else if (budjet <= 100 && season.equals("winter")) {
            System.out.println("Somewhere in Bulgaria");
            System.out.print("Hotel - ");
            System.out.printf("%.2f", budjet2);
        } else if (budjet <= 1000 && season.equals("summer")) {
            System.out.println("Somewhere in Balkans");
            System.out.print("Camp - ");
            System.out.printf("%.2f", budjet3);
        } else if (budjet <= 1000 && season.equals("winter")) {
            System.out.println("Somewhere in Balkans");
            System.out.print("Hotel - ");
            System.out.printf("%.2f", budjet4);
        } else if (budjet > 1000 && season.equals("summer")) {
            System.out.println("Somewhere in Europe");
            System.out.print("Hotel - ");
            System.out.printf("%.2f", budjet5);
             } else   {
                 System.out.println("Somewhere in Europe");
                 System.out.print("Hotel - ");
                 System.out.printf("%.2f",budjet5);
             }
        }

    }





