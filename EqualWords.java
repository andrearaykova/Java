import java.util.Scanner;

/**
 * Created by andrearaykova on 1/16/17.
 */
public class EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        String word2 = scanner.nextLine().toLowerCase();

        if (word.equals(word2)) {
            System.out.println("yes");
        }  else
            System.out.println("no");
    }
}
