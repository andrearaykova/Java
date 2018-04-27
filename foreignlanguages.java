import java.util.Scanner;

/**
 * Created by andrearaykova on 9/21/17.
 */
public class foreignlanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String language = scanner.nextLine();

        switch (language) {
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
                default:
                    System.out.println("unknown");
                    break;
        }

    }
}
