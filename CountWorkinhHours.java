import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by andrearaykova on 10/17/17.
 */
class CountWorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<CustDate> holidays = holidays();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(scanner.nextLine(), dtf);
        LocalDate endDate = LocalDate.parse(scanner.nextLine(), dtf);

        int workdaysCount = 0;

        int dif = (int) ChronoUnit.DAYS.between(date1, endDate);

        for (int i = 0; i <= dif; i++) {
            CustDate currentDate = new CustDate(date1.getDayOfMonth(), date1.getMonth().getValue());
            boolean isAHoliday = checkIfHoliday(holidays, currentDate);
            if (date1.getDayOfWeek().getValue() < 6 && !isAHoliday) {
                workdaysCount++;
            }
            date1 = date1.plusDays(1);
        }
        System.out.println(workdaysCount);
    }

    private static boolean checkIfHoliday(ArrayList<CustDate> holidays, CustDate currentDate) {
        boolean isAHoliday = false;
        for (int i = 0; i < holidays.size(); i++) {
            if (currentDate.equals(holidays.get(i))) {
                isAHoliday = true;
            }


        }
        return isAHoliday;
    }

    private static ArrayList<CustDate> holidays() {
        CustDate[] holidays = new CustDate[]{new CustDate(1, 1), new CustDate(3, 3), new CustDate(1, 5), new CustDate(6, 5),
                new CustDate(24, 5), new CustDate(6, 9), new CustDate(22, 9), new CustDate(1, 11),
                new CustDate(24, 12), new CustDate(25, 12), new CustDate(26, 12)};
        return new ArrayList<>(Arrays.asList(holidays));
    }
}
   class CustDate {
    private  int day;
    private int month;

    CustDate(int day, int month) {
        this.day = day;
        this.month = month;
    }

    boolean equals(CustDate date) {
        if (this.day == date.day && this.month == date.month) {
            return true;
        } else {
            return false;
        }
    }

}


