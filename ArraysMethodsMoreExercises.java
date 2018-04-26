import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Created by andrearaykova on 10/11/17.
 */
public class ArraysMethodsMoreExercises {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] numbers  = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0.0;
        double average = 1.0;



        for (int i = 0; i < numbers.length  ; i++) {

            int currentnum = numbers[i];
            if (currentnum > max) {
                max = currentnum;
            } if (currentnum < min) {
                min = currentnum;
            }
            sum += currentnum;
            average = sum / numbers.length;
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Sum = " + (int)sum);
        System.out.println("Average = " + average);

    }
}
