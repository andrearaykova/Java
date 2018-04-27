import java.util.Scanner;

/**
 * Created by andrearaykova on 9/22/17.
 */
public class differentnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (b - a < 5) {
            System.out.println("No");
        } else {
            for (int i = a; i <= b - 4 ; i++) {
                for (int j = i + 1; j <= b - 3 ; j++) {
                    for (int k = j + 1; k <= b - 2 ; k++) {
                        for (int l = k + 1; l <= b - 1; l++) {
                            for (int m = l + 1; m <= b ; m++) {
                                System.out.println(i+" " +j +" " + k + " " + l +" "+ m);

                            }

                        }

                    }

                }

            }
        }
    }
}
