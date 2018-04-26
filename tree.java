import java.util.Scanner;

/**
 * Created by andrearaykova on 2/12/17.
 */
public class tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int heigh = n + 1;
        for (int i = 0; i < heigh ; i++) {
            System.out.println(doMagic(" ",n - i) + doMagic("*",i) + " | " +
                    doMagic("*",i) + doMagic(" ",n - i));

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
