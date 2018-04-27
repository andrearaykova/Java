import java.util.Scanner;

/**
 * Created by andrearaykova on 2/21/17.
 */
public class pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int num = 1;
        while (true) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                if (num == end) {
                    return;

                }
                num++;
            }

        i++;

        System.out.println();
    }

}
}

