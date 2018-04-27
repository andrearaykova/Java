import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * Created by andrearaykova on 11/4/17.
 */
public class Resurrection {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n ; i++) {

            BigDecimal totalLenghtBody = new BigDecimal(reader.readLine());
            BigDecimal totalWidthBody =  new BigDecimal(reader.readLine());
            BigDecimal totalLenghtWing = new BigDecimal(reader.readLine());

            BigDecimal totalYears = (totalLenghtBody)
                    .multiply(totalWidthBody).add(totalLenghtWing.multiply(totalLenghtWing));

            System.out.println(totalYears);
        }
    }
}
