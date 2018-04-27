import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by andrearaykova on 10/20/17.
 */
public class SinoTheWalker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split(":"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int hours = input[0];
        int min = input[1];
        int sec = input[2];

        long numOfSteps = Long.parseLong(scanner.nextLine());
        long timeInSec = Long.parseLong(scanner.nextLine());

        long secondsOutput = numOfSteps * timeInSec;

        long allSec = (sec + (min * 60) + (hours * 3600)) + secondsOutput;

        System.out.printf("Time Arrival: " + allSec/3600 % 24
                + ":" + allSec/60 % 60
                + ":" + (allSec % 60));
    }
}
