import java.util.Scanner;

/**
 * Created by andrearaykova on 9/21/17.
 */
public class Theatrepromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());


        if (day.equals( "Weekday") ){

            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {

                System.out.println("12$");
            } else if (age > 18 && age <= 64) {
                System.out.println("18$");
            } else {

                System.out.println("Error!");
            }

        }
        else if (day.equals("Weekend")) {

            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                System.out.println("15$");
            } else if (age > 18 && age <= 64) {
                System.out.println("20$");
            } else {

                System.out.println("Error!");
            }

        }
       else if (day.equals("Holiday")) {

            if (age >= 0 && age <= 18) {
                System.out.println("5$");
            } else if (age > 18 && age <= 64) {
                System.out.println("12$");
            } else if (age > 64 && age <= 122) {
                System.out.println("10$");
            } else {

                System.out.println("Error!");

            }
        }



                }
            }


