import java.util.Scanner;

/**
 * Created by andrearaykova on 1/14/17.
 */
public class sumsecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s1 = Integer.parseInt(scanner.nextLine());
        int s2 = Integer.parseInt(scanner.nextLine());
        int s3 = Integer.parseInt(scanner.nextLine());
         int totalSeconds = s1+ s2 + s3;
         int minutes = totalSeconds/60;
         int seconds = totalSeconds % 60;

         if (seconds < 10 ) {
             System.out.println(minutes + ":0" + seconds);
         } else {
             System.out.println(minutes + ":" + seconds);
         }
    }
}
