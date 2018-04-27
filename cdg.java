import java.util.Scanner;

/**
 * Created by andrearaykova on 2/18/17.
 */
public class cdg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        // int biggerNumber = Math.max(a,b);

       //  while (a % biggerNumber != 0 || b % biggerNumber != 0) {
        //     biggerNumber--;
       //  }
      //  System.out.println(biggerNumber);

        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        System.out.println(a);


    }
}
