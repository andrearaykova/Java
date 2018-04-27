import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by andrearaykova on 11/1/17.
 */
public class Ladybugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];
        int[] ladybugIndices = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        for (int ladybugIndex : ladybugIndices) {
            if (ladybugIndex >= 0 && ladybugIndex < field.length) {
                field[ladybugIndex] = 1;
            }
        }
        while (true) {
            String[] tokens = scanner.nextLine().split(" ");
            if (tokens[0].equals("end")) {
                break;
            }
            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int positions = Integer.parseInt(tokens[2]);
            if (index < 0 || index >= field.length || field[index] == 0) {
                continue;
            }
            field[index] = 0;
            if (direction.equals("left")) {
                while (index >= 0) {
                    if (index - positions >= 0 && field[index - positions] == 0) {
                        field[index - positions] = 1;
                        break;
                    }
                    index -= positions;
                }
            } else if (direction.equals("right")) {
                while (index < field.length) {
                    if (index + positions < field.length && field[index + positions] == 0) {
                        field[index + positions] = 1;
                        break;
                    }
                    index += positions;
                }
            }
        }
        for (int i : field) {
            System.out.print(i + " ");
        }
    }
}