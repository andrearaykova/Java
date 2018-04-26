import java.util.Scanner;

/**
 * Created by andrearaykova on 2/13/17.
 */
public class sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(doMagic("*", 2 * n) + doMagic(" ", n) +
                doMagic("*", 2 * n));

        for (int i = 0; i < n - 2; i++) {
            String space = doMagic(" ", n);
            String pipes = doMagic("|", n);
            String right = "*" + doMagic("/", 2 * n - 2) + "*";
            System.out.print(right);
            if (i == (n - 2) / 2  && n % 2 != 0) {
                System.out.print(pipes);
            } else if (i == ((n - 2) / 2) - 1 && n % 2 == 0) {
                System.out.print(pipes);
            } else {
                System.out.print(space);
            }
            System.out.print(right);
            System.out.println();




        }

        System.out.println(doMagic("*", 2 * n) + doMagic(" ", n) +
                doMagic("*", 2 * n));
    }

    public static String doMagic(String text,int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;

        }
        return output;
    }
}
