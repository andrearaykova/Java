import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by andrearaykova on 10/11/17.
 */
public class SearchForANumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> num = Arrays.stream(reader.readLine().split("\\s+"))
                  .map(Integer::valueOf)
                  .collect(Collectors.toList());

        int[] command = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        int firstnum = command[0];
        int secondnum = command[1];
        int thirdnum = command[2];






    }
}
