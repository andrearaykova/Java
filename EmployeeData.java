import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by andrearaykova on 9/29/17.
 */
public class EmployeeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = "Amanda";
        String lastName = "Jonson";
        int age = 27;
        String gender = "f";
        long personalID = 8306112507L;
        int employeeNumber = 27563571;

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Personal ID: " + personalID);
        System.out.println("Unique Employee number: " + employeeNumber);
    }
}
