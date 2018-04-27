import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by andrearaykova on 9/22/17.
 */
public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int money2 = 0;
        int money3 = 0;
        int night = nights-1;

        DecimalFormat newFormat = new DecimalFormat("#0.00");

        if (month.equals("May") || month.equals("October")) {
            if (nights >= 7 && month.equals("May")) {
                money = 50;
                money2 = 65;
                money3 = 75;

                System.out.println("Studio: " + newFormat.format((nights * money) - ((nights * money) * 0.05)) + " lv.");
                System.out.println("Double: " + newFormat.format(nights * money2) + " lv.");
                System.out.println("Suite: " + newFormat.format(nights * money3) + " lv.");

            }

            if (month.equals("October") && nights > 7) {

                money = 50;
                money2 = 65;
                money3 = 75;
                System.out.println("Studio: " + newFormat.format((night * money) - ((night * money) * 0.05)) + " lv.");
                System.out.println("Double: " + newFormat.format(nights * money2) + " lv.");
                System.out.println("Suite: " + newFormat.format(nights * money3) + " lv.");

            }
            if (nights <= 7) {
                money = 50;
                money2 = 65;
                money3 = 75;
                System.out.println("Studio: " + newFormat.format(nights * money) + " lv.");
                System.out.println("Double: " + newFormat.format(nights * money2) + " lv.");
                System.out.println("Suite: " + newFormat.format(nights * money3) + " lv.");
            }
        }


        else if (month.equals("June") || month.equals("September")) {

            if (month.equals("September") && nights >= 7){

                money = 60;
                money2 = 72;
                money3 = 82;
                System.out.println("Studio: " + newFormat.format(night*money) + " lv.");
                System.out.println("Double: " + newFormat.format(nights*money2) + " lv.");
                System.out.println("Suite: " + newFormat.format(nights*money3) + " lv.");

            }

            if (nights > 14 ) {
                money = 60;
                money2 = 72;
                money3 = 82;

                System.out.println("Studio: " + newFormat.format(nights*money) + " lv.");
                System.out.println("Double: " + newFormat.format((nights*money2)-((nights*money2)*0.1)) + " lv.");
                System.out.println("Suite: " + newFormat.format(nights*money3) + " lv.");

            }



            if (nights < 14 && month.equals("June")) {
                money = 60;
                money2 = 72;
                money3 = 82;
                System.out.println("Studio: " + newFormat.format(nights*money) + " lv.");
                System.out.println("Double: " + newFormat.format(nights*money2) + " lv.");
                System.out.println("Suite: " + newFormat.format(nights*money3) + " lv.");
            }

        }
        else if (month.equals("July") || month.equals("August") || month.equals("December")) {

            if (nights > 14) {
                money = 68;
                money2 = 77;
                money3 = 89;

                System.out.println("Studio: " + newFormat.format(nights*money) + " lv.");
                System.out.println("Double: " + newFormat.format(nights*money2) + " lv.");
                System.out.println("Suite: " + newFormat.format((nights*money3)-((nights*money3)*0.15)) + " lv.");

            }

            if (nights <= 14 ) {
                money = 68;
                money2 = 77;
                money3 = 89;
                System.out.println("Studio: " + newFormat.format(nights*money) + " lv.");
                System.out.println("Double: " + newFormat.format(nights*money2) + " lv.");
                System.out.println("Suite: " + newFormat.format(nights*money3) + " lv.");
            }





        }


    }
}
