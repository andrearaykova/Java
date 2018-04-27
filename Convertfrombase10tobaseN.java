import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by andrearaykova on 10/24/17.
 */
public class Convertfrombase10tobaseN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] num = scanner.nextLine().split(" ");
        int baseNum = Integer.parseInt(num[0]);
        BigInteger otherNum = new BigInteger(num[1]);

        StringBuilder sb = new StringBuilder();

        while (true){
            int divide = otherNum.compareTo(BigInteger.valueOf(0));

            if(divide == 0){
                break;
            }

            sb.append(otherNum.remainder(BigInteger.valueOf(baseNum)));
            otherNum = otherNum.divide(BigInteger.valueOf(baseNum));

        }

        System.out.println(sb.reverse());

    }
}
