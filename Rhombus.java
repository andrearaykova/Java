

import java.util.Scanner;

/**
 * Created by andrearaykova on 2/13/17.
 */
public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String space = doMagic(" ",n - i);
            String stars = doMagic(" *",i).trim();
            System.out.println( space + stars);


        }
        for (int i = n - 1; i > 0 ; i--) {
            String space = doMagic(" ",n - i);
            String stars = doMagic(" *",i).trim();
            System.out.println( space + stars);



        }

    }

    public static String doMagic(String text,int repeatCount) {
    String output = "";
    for (int i = 0; i < repeatCount; i++) {
        output = output + text;

    }
    return output;
}
}
