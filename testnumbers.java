import java.util.Scanner;

/**
 * Created by andrearaykova on 9/22/17.
 */
public class testnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Math.abs(Integer.parseInt(scanner.nextLine()));
        int b = Math.abs(Integer.parseInt(scanner.nextLine()));
        int magicNumber = Math.abs(Integer.parseInt(scanner.nextLine()));
        int sum = 0;
        int totalCombinations = 0;
        boolean isMagicNumber = false;


        for (int i = a; i >= 1; i--)
        {
            for (int j = 1; j <= b; j++)
            {
                if (sum >= magicNumber)
                {
                    isMagicNumber = true;
                    break;
                }
                else
                {
                    totalCombinations++;
                    sum += 3 * (i * j);
                }
            }
            if (sum >= magicNumber)
            {
                isMagicNumber = true;
                break;
            }
        }

        System.out.println(totalCombinations + " combinations");

        if (isMagicNumber)
        {
            System.out.println("Sum: " + sum + " >= "  + magicNumber);
        }
        else
        {
            System.out.println("Sum: " + sum);
        }
    }
    }







