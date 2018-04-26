import java.util.Scanner;

/**
 * Created by andrearaykova on 1/14/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade = Double.parseDouble(console.nextLine());

        if (grade >= 5.5) {
            System.out.println("Excellent!");
        } else
            System.out.println("Not excellent.");
        }
    }

