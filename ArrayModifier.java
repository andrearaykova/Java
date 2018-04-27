import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by andrearaykova on 10/20/17.
 */
public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();



        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    int temp = numbers[index1];
                    numbers[index1] = numbers[index2];
                    numbers[index2] = temp;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(tokens[1]);
                    index2 = Integer.parseInt(tokens[2]);
                    numbers[index1] *= numbers[index2];
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] -= 1;
                    }

                    break;
            }

            command = scanner.nextLine();
        }

        String output = "";
        for (int number : numbers) {
            output += (String.valueOf(number) + ", ");
        }
        System.out.println(output.substring(0, output.length() - 2));
    }
}






