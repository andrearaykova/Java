import java.util.Scanner;

/**
 * Created by andrearaykova on 2/15/17.
 */
public class diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int one = (n/2) - 1;
        int o = 2;



        for (int i = 0; i < (n/2)  ; i++) {
            if (n % 2 == 0);
            String firstLineChetni = doMagic("-",one) + doMagic("*",o) +
                    doMagic("-",one);
            System.out.println(firstLineChetni);
            one --;
            o -= 2;
            System.out.println(doMagic("-",one) + doMagic("*",1) +
                    doMagic("-",2) + doMagic("*",1) + doMagic("-",one));



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
