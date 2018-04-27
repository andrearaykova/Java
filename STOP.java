import java.util.Scanner;

/**
 * Created by andrearaykova on 3/11/17.
 */
public class STOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(doMagic(".",n + 1) + doMagic("_",2 * n + 1)
        + doMagic(".",n + 1));


        int dots = n;
        int oneSide = n - 1;
        int down = 2 * n - 1;
        int otherSide = n - 1;

        for (int i = 0; i < n; i++) {
            System.out.println(doMagic(".", dots) + doMagic("/", 2) + doMagic("_", down)
                    + doMagic("\\", 2) + doMagic(".", dots));
            dots--;
            down += 2;


        }
        if (n % 2 == 0) {
//
            System.out.print(doMagic("/", 2) + doMagic("_", n + (n / 2)  ) + "STOP!" +
                    doMagic("_",n + (n / 2) ) + doMagic("\\", 2));
//
//
            System.out.println();
        } else {
            int downn = n;
            System.out.print(doMagic("/",2) + doMagic("_",n) + "STOP!" +
                    doMagic("_",n) + doMagic("\\", 2));
            downn += (n/2) + 1;
            System.out.println();
//
//
        }

        for (int i = 0; i < n; i++) {
            System.out.println(doMagic(".",dots) + doMagic("\\",2) + doMagic("_",down)
                    + doMagic("/",2) + doMagic(".",dots));
            dots++;
            down -= 2;

        }

    }



    public static String doMagic(String text, int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;

        }
        return output;


    }
}
