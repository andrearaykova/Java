import java.util.Scanner;

/**
 * Created by andrearaykova on 3/18/17.
 */
public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double result = 0;
        double invalid = 0;
        double first = 0;
        double second = 0;
        double third = 0;
        double fourth = 0;
        double fifth = 0;

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (number >= 0 && number <= 9) {
                result = result + (number - (number * 80)/ 100);
                first++;
            } else if (number >= 10 && number <= 19) {
                result = result + (number - (number * 70)/ 100);
                second++;
            } else if (number >= 20 && number <= 29) {
                result = result + (number - (number * 60)/ 100);
                third++;
            } else if (number >= 30 && number <= 39) {
                result = result + 50;
                fourth++;
            } else if (number >= 40 && number <= 50) {
                result = result + 100;
                fifth++;
            }else {
                result = result / 2;
                invalid++;
            }
        }

        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n",((first / n) * 100) );
        System.out.printf("From 10 to 19: %.2f%%\n",((second / n) * 100) );
        System.out.printf("From 20 to 29: %.2f%%\n",((third / n) * 100) );
        System.out.printf("From 30 to 39: %.2f%%\n",((fourth / n) * 100) );
        System.out.printf("From 40 to 50: %.2f%%\n",((fifth / n) * 100) );
        System.out.printf("Invalid numbers: %.2f%%\n",((invalid / n) * 100) );




            }

        }

