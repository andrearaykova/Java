import java.util.Scanner;

/**
 * Created by andrearaykova on 10/24/17.
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String first = input[0];
        String second = input[1];

        long sum = 0;

        int min = Math.min(first.length(),second.length());

        for (int i = 0; i < min; i++) {
            sum += first.charAt(i) * second.charAt(i);
        }

        String max = first.length() > second.length() ? first : second;


        for (int i = min; i < max.length(); i++) {

            sum += max.charAt(i);
        }
        System.out.println(sum);

    }
}
