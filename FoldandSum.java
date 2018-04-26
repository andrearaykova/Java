import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.io.InputStreamReader;

/**
 * Created by andrearaykova on 10/6/17.
 */
public class FoldandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int k = numbers.length / 4;

        int[] leftAndRightSide = new int[k + k];

        int count = 0;
        for (int i = k - 1; i >= 0; i--) {
            leftAndRightSide[count] = numbers[i];
            count++;
        }

        int[] middle = new int[k + k];
        int middleCount = 0;
        for (int i = k; i < numbers.length - k; i++) {
            middle[middleCount] = numbers[i];
            middleCount++;
        }

        int rightCount = 0;
        while (k-- > 0) {
            leftAndRightSide[count] = numbers[numbers.length - 1 - rightCount];
            count++;
            rightCount++;
        }

        for (int i = 0; i < leftAndRightSide.length; i++) {
            middle[i] += leftAndRightSide[i];
        }

        for (int i = 0; i < middle.length; i++) {
            if (i < middle.length - 1) {
                System.out.print(middle[i] + " ");
            } else {
                System.out.println(middle[i]);
            }


        }
    }
}
