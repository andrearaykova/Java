
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * Created by andrearaykova on 10/10/17.
 */
public class MaxSequenceEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxnum = 0;
        int count = 1;
        int maxcount = 1;
        int pos = 0;

        while (pos < numbers.length - 1) {
            if (numbers[pos] == numbers[pos + 1]) {
                count ++;
                if (count > maxcount) {
                    maxcount = count;
                    maxnum = numbers[pos];

                }
            }
            else  {
                count = 1;
            }
            pos ++;
            if (maxcount == 1) {
                maxnum = numbers[0];
            }



        }
        for (int i = 0; i < maxcount; i++) {
            System.out.print(maxnum + " ");

        }

    }
}
