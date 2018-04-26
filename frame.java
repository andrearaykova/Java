import java.util.Scanner;

/**
 * Created by andrearaykova on 2/11/17.
 */
public class frame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("+");
        for (int i = 0; i < n - 2 ; i++) {
            System.out.print(" -");
        }
        System.out.print(" +");
        System.out.println();

        for (int i = 0; i < n - 2 ; i++) {
            System.out.print("|");
            System.out.print(doMagic(" -",n-2));
            System.out.println(" |");
        }

        System.out.print("+");
        for (int i = 0; i < n - 2 ; i++) {
            System.out.print(" -");
        }
        System.out.print(" +");




    }

    public static String doMagic(String text,int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;

        }
        return output;
    }
}