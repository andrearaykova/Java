import java.util.Scanner;

/**
 * Created by andrearaykova on 10/2/17.
 */
public class DrawaFilledSquare {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(doMagic("-",2*num));

        for (int i = 0; i < num - 2 ; i++) {
            System.out.println("-" + doMagic("\\/",num-1) + "-");

        }
        System.out.println(doMagic("-",2*num));




    }


    public static String doMagic(String text, int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;

        }
        return output;
    }
}

