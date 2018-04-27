import java.util.Scanner;

/**
 * Created by andrearaykova on 10/1/17.
 */
public class TheaThePhotographer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double allpics = Double.parseDouble(scanner.nextLine());
        double filterTime = Double.parseDouble(scanner.nextLine());
        double goodPics = Double.parseDouble(scanner.nextLine());
        goodPics = Math.ceil((allpics * goodPics) / 100.0);
        double uploadTime = Double.parseDouble(scanner.nextLine());


        double all = (allpics * filterTime) + (goodPics * uploadTime);
        all = (long)(all);

        System.out.println();
    }
}
