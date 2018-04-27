import java.util.Scanner;

/**
 * Created by andrearaykova on 3/15/17.
 */
public class ontimeforexam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourexam = Integer.parseInt(scanner.nextLine());
        int minexam = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int examtime = hourexam * 60 + minexam;
        int studenttime = hour * 60 + min;
        int diff = studenttime - examtime;

        if (diff < -30) {
            System.out.println("Early");
        } else if (diff <= 0) {
            System.out.println("On time");
        } else {
            System.out.println("Late");
        } if (diff != 0) {
            int hours = Math.abs(diff / 60);
            int minutes = Math.abs(diff % 60);

            if ( hours > 0) {
                if (minutes < 10) {
                    System.out.println(hours + ":0" + minutes + " hours");
                } else {
                    System.out.println(hours + ":" + minutes + " hours");
                }

                } else {
                System.out.println(minutes + " minutes");
                if (diff < 0)
                    System.out.println(" before the start");
                else
                    System.out.println(" after the start");
            }
        }

    }

}
