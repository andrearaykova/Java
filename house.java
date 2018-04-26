import java.util.Scanner;

/**
 * Created by andrearaykova on 2/14/17.
 */
public class house {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int one = 2;
        int leftRightLine = (n/2) - 1;
        int down = n - 2;
        int three = (n/2) + 1;
        int threee = n/2;
        int threeee = 1;

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                System.out.println(doMagic("-", leftRightLine) + doMagic("*", one) + doMagic("-", leftRightLine));
                leftRightLine--;
                one += 2;
            }
            for (int i = 0; i < n / 2; i++) {
                System.out.println(doMagic("|", 1) + doMagic("*", down) + doMagic("|", 1));

            }
        }
            else {
            for (int i = 0; i < three ; i++) {
                System.out.println(doMagic("-",threee) + doMagic("*",threeee) + doMagic("-",threee));
                threee --;
                threeee += 2;
            }
            for (int i = 0; i < n/2 ; i++) {
                System.out.println(doMagic("|",1) + doMagic("*",down) + doMagic("|",1));

            }
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
