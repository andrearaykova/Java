import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

/**
 * Created by andrearaykova on 10/10/17.
 */
public class SumReversedNum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long result = Arrays.stream(reader.readLine().split("\\s+"))
                .map(text -> new StringBuilder(text).reverse().toString())
                .mapToInt(Integer::parseInt).sum();

        System.out.println(result);
    }
}
