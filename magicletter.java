import java.util.Scanner;

/**
 * Created by andrearaykova on 9/22/17.
 */
public class magicletter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        String skip = scanner.nextLine();
        String result = "";

        for (char i = first; i <= second; i++) {
            for (char j = first; j <= second; j++) {
                for (char k = first; k <= second ; k++) {
                    String reminder = "" + i + j + k + " ";

                    if (!reminder.contains(skip)) {
                        result += reminder;
                    }

                }

            }

        }
        System.out.println(result);


    }
}
