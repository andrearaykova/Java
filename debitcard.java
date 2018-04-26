import java.util.Scanner;

/**
 * Created by andrearaykova on 9/19/17.
 */
public class debitcard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstnumber = Integer.parseInt(scanner.nextLine());
        int secondnumber = Integer.parseInt(scanner.nextLine());
        int thirdnumber = Integer.parseInt(scanner.nextLine());
        int fourthnumber = Integer.parseInt(scanner.nextLine());



        System.out.printf("%04d %04d %04d %04d",firstnumber,secondnumber,thirdnumber,fourthnumber);

    }
}
