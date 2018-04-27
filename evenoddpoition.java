import java.util.Scanner;

/**
 * Created by andrearaykova on 2/8/17.
 */
public class evenoddpoition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        int oddMax = Integer.MIN_VALUE;
        int oddMin = Integer.MAX_VALUE;
        int oddSum = 0;
        int evenMax = Integer.MIN_VALUE;
        int evenMin = Integer.MAX_VALUE;
        int evenSum = 0;

        for (int cnt=1;cnt<= n; cnt++)
        {
            Integer number = Integer.parseInt(scanner.nextLine());

            if (cnt % 2 == 0) {
                evenSum += number;
                if (number > evenMax)
                {
                    evenMax = number;
                }
                if (number < evenMin)
                {
                    evenMin = number;
                }
            }
            else
            {
                oddSum += number;
                if (number > oddMax)
                {
                    oddMax = number;
                }
                if (number < oddMin)
                {
                    oddMin = number;
                }
            }

        } //end of for
        System.out.println("OddSum="+ oddSum);
        if(oddMin == Integer.MAX_VALUE)
        {
            System.out.println("OddMin=No");
        }
        else
        {
            System.out.println("OddMin=" + oddMin);
        }
        if (oddMax == Integer.MIN_VALUE)
        {
            System.out.println("OddMax=No");
        }
        else
        {
            System.out.println("OddMax=" + oddMax);
        }


        System.out.println("EvenSum=" + evenSum);
        if(evenMin == Integer.MAX_VALUE) {
            System.out.println("EvenMin=No");
        }
        else
        {
            System.out.println("EvenMin=" + evenMin);
        }

        if(evenMax == Integer.MIN_VALUE)
        {
            System.out.println("EvenMax=No");
        }
        else
        {
            System.out.println("EvenMax=" + evenMax);
        }

    }
}
