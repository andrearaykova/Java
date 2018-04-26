import java.util.Scanner;

/**
 * Created by andrearaykova on 2/11/17.
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("$");
            for (int j = 0; j < i ; j++) {
                System.out.print(" $");

            }



            System.out.println();
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