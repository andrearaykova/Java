import java.util.Scanner;

/**
 * Created by andrearaykova on 1/23/17.
 */
public class tc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine().toLowerCase();
        double sell = Double.parseDouble(scanner.nextLine());
        double commission = -1;


        if (town.equals("sofia")) {
            if (sell >= 0 && sell <= 500) {
                commission = 0.05;

                System.out.printf("%.2f", commission * sell);
            } else if (sell > 500 && sell <= 1000) {
                commission = 0.07;
                System.out.printf("%.2f", commission * sell);
            } else if (sell > 1000 && sell <= 10000) {
                commission = 0.08;
                System.out.printf("%.2f", commission * sell);
            } else if (sell > 10000) {
                commission = 0.12;
                System.out.printf("%.2f", commission * sell);
            }
        }
            else if (town.equals("varna")) {
               if (sell >= 0 && sell <= 500) {
                    commission = 0.045;

                    System.out.printf("%.2f", commission * sell);
                } else if (sell > 500 && sell <= 1000) {
                    commission = 0.075;
                    System.out.printf("%.2f", commission * sell);
                } else if (sell > 1000 && sell <= 10000) {
                    commission = 0.1;
                    System.out.printf("%.2f", commission * sell);
                } else if (sell > 10000) {
                    commission = 0.13;
                    System.out.printf("%.2f", commission * sell);
                }
            }
               else if (town.equals("plovdiv")) {
                   if (sell >= 0 && sell <= 500) {
                       commission = 0.055;

                       System.out.printf("%.2f", commission * sell);
                   } else if (sell > 500 && sell <= 1000) {
                       commission = 0.08;
                       System.out.printf("%.2f", commission * sell);
                   } else if (sell > 1000 && sell <= 10000) {
                       commission = 0.12;
                       System.out.printf("%.2f", commission * sell);
                   } else if (sell > 10000) {
                       commission = 0.145;
                       System.out.printf("%.2f", commission * sell);
                   }
                   else {
                       System.out.println("error");
                   }
               }
                    else  {
                        System.out.println("error");
                    }

            }

        }


