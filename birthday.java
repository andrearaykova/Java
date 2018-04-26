import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by andrearaykova on 12/20/16.
 */
public class birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        LocalDate birthDay = LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE.ofPattern("dd-MM-yyyy"));
        birthDay = birthDay.plusDays(999);
        String dayAfter999 = birthDay.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(dayAfter999);

    }
}
