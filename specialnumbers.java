import java.util.Scanner;

/**
 * Created by andrearaykova on 3/11/17.
 */
public class specialnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i < 10 ; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10 ; k++) {
                    for (int l = 1; l < 10; l++) {
                        if ((n % i == 0) && (n % j == 0) && (n % k == 0)
                                && (n % l == 0)) {
                            System.out.print(i);
                            System.out.print(j);
                            System.out.print(k);
                            System.out.print(l);
                            System.out.print(" ");
                        }

                    }

                }
                
            }


        }


    }
}
