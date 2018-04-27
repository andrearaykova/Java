import java.util.Scanner;

/**
 * Created by andrearaykova on 3/9/17.
 */
public class sleepycatTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());


        int restdays = restDays * 127;
        int workdays = (365 - restDays) * 63;
        int realtimeforplay = workdays + restdays;
        int left = 30000 - realtimeforplay;
        int hours = left / 60;
        int min = left % 60;

        if (30000 > realtimeforplay) {
            System.out.println("Tom sleeps well");
            System.out.printf("%s hours and %s minutes less for play",hours,min);
        } else  {
            int leftt = realtimeforplay - 30000;
            int hourss = leftt / 60;
            int minn = leftt % 60;
            System.out.println("Tom will run away");
            System.out.printf("%s hours and %s minutes more for play",hourss,minn);
        }



    }
}
