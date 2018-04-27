import java.util.Scanner;

/**
 * Created by andrearaykova on 9/29/17.
 */
public class VariableinHexFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reminder = scanner.nextLine();

        System.out.println(Integer.parseInt(reminder.substring(2),16));

       }
    }

