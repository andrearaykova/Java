import java.util.Scanner;

/**
 * Created by andrearaykova on 3/14/17.
 */
public class butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());


         int width = 2 * n - 1;
         int heigh = 2 * (n - 2) + 1;
         int side = n - 1;
         int half = n / 2;

        System.out.println(doMagic("*",n-2) + "\\" + " " + "/" + doMagic("*",n-2));

        if (n > 3) {
            for (int i = 1; i < half; i++) {

                System.out.println(doMagic("-", n - 2) + "\\" + " " + "/" + doMagic("-", n - 2));
                System.out.println(doMagic("*",n-2) + "\\" + " " + "/" + doMagic("*",n-2));



            }
        } else {
            System.out.println(doMagic(" ",side) + "@" + doMagic(" ",side));
        }
        System.out.println(doMagic(" ",side) + "@" + doMagic(" ",side));

        for (int i = 1; i < half   ; i++) {
            System.out.println(doMagic("*", n - 2) + "/" + " " + "\\" + doMagic("*", n - 2));
            System.out.println(doMagic("-",n-2) + "/" + " " + "\\" + doMagic("-",n-2));

        }  System.out.println(doMagic("*",n-2) + "/" + " " + "\\" + doMagic("*",n-2));

    }



    public static String doMagic(String text, int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;

        }
        return output;


    }
}

