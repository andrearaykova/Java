

import java.util.Scanner;

/**
 * Created by andrearaykova on 28.11.17.
 */
public class VariableHexFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int output = Integer.parseInt(input,16);
        System.out.println(output);

    }
}
