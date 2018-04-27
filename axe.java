import java.util.Scanner;

/**
 * Created by andrearaykova on 3/5/17.
 */
public class axe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int first = 3 * n;
        int empty = 0;
        int last = (2 * n) - 2;

        for (int i = 0; i < n ; i++) {
            System.out.println(doMagic("-",first) + "*" + doMagic("-",empty)
            + "*" + doMagic("-",last));
            empty++;
            last--;

        }
        empty--;
        last++;
        for (int i = 0; i < n/2 ; i++) {
            System.out.println(doMagic("*",first) + "*" + doMagic("-",empty)
                    + "*" + doMagic("-",last));


        }
        for (int i = 0; i < (n/2) - 1 ; i++) {
            System.out.println(doMagic("-",first) + "*" + doMagic("-",empty)
                    + "*" + doMagic("-",last));
            first--;
            empty += 2;
            last--;

        } System.out.println(doMagic("-",first) + "*" + doMagic("*",empty)
                + "*" + doMagic("-",last));


    }



    public static String doMagic(String text, int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;

        }
        return output;


    }
}