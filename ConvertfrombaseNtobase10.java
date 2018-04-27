import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by andrearaykova on 10/24/17.
 */
public class ConvertfrombaseNtobase10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] num = scanner.nextLine().split(" ");
        int baseNum = Integer.parseInt(num[0]);

        StringBuilder number = new StringBuilder(num[1]);
        number.reverse();

        System.out.println(new BigInteger(num[1], baseNum));

        BigInteger sum = new BigInteger(String.valueOf(0));

        for (int i = 0; i < number.length(); i++) {
            sum = sum.add(BigInteger.valueOf(Long.parseLong(String.valueOf(number.charAt(i)))).multiply(new BigInteger(String.valueOf(baseNum)).pow(i)));
        }

        System.out.println(sum);


    }
}
