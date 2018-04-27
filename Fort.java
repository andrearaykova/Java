import java.util.Scanner;

/**
 * Created by andrearaykova on 3/12/17.
 */
public class Fort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int k = 0;

        if (n % 2 != 0) {
            k = 1;
        }

        System.out.println("/" + doMagic("^",n / 2) + "\\" + doMagic("_",2 * n - n - 4 +k)
                +  "/" + doMagic("^",n / 2) + "\\");

        for (int i = 0; i < n - 2; i++) {
            if ( i != n - 3) {


                System.out.println("|" + doMagic(" ", 2 * n - 2) + "|");
            } else {
                System.out.println("|" + doMagic(" ",n / 2 + 1) +
                doMagic("_",2 * n - n - 4 + k) +
                        doMagic(" ",n / 2 + 1) + "|");
            }

        }
        System.out.println("\\" + doMagic("_",n / 2) + "/" +
        doMagic(" ",2 * n - n - 4 + k) + "\\" +
        doMagic("_",n / 2) + "/");

    }






 public static String doMagic(String text, int repeatCount) {
    String output = "";
    for (int i = 0; i < repeatCount; i++) {
        output = output + text;

    }
    return output;


}
}

