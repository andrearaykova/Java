import java.util.Scanner;

/**
 * Created by andrearaykova on 3/18/17.
 */
public class SoftUniLogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int hashtag = 1;
        int dots = (12 * n - 5 - hashtag)/2;

        int dotsDown = 2;
        int dotsdown = 3;
        int hashtags = 12*n-11;

        for (int i = 0; i < n*2 ; i++) {
            System.out.println(doMagic(".",dots) + doMagic("#",hashtag) + doMagic(".",dots));

            dots -= 3;
            hashtag += 6;


        }
        for (int i = 0; i < n - 2; i++) {
            System.out.println("|" + doMagic(".",dotsDown) + doMagic("#",hashtags)
            + doMagic(".",dotsdown));
            dotsDown += 3;
            hashtags -= 6;
            dotsdown += 3;

        }
        for (int i = 0; i < n-1; i++) {
            int l = n * 6 + 1;
            int all = 12 * n - 5;

            System.out.println("|" + doMagic(".",(all-l)/2 - 1) + doMagic("#",l)
            + doMagic(".",(all - l) /2 ));
            
        }
        int l2 = n * 6 + 1;
        int all2 = 12 * n - 5;
        System.out.println("@" + doMagic(".",(all2 - l2)/2 - 1) + doMagic("#",l2)
        + doMagic(".",(all2-l2)/2));

    }




    public static String doMagic(String text, int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;

        }
        return output;


    }
}

