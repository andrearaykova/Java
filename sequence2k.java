import java.util.Scanner;

/**
 * Created by andrearaykova on 2/18/17.
 */
public class sequence2k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i = i * 2 + 1) {
            System.out.println(i);

        }


        }

    }

