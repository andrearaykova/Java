import java.util.Scanner;

/**
 * Created by andrearaykova on 2/8/17.
 */
public class half {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ele = Integer.parseInt(scanner.nextLine());
        int maxele = 0;
        int sum = 0;
        for (int i = 0; i < ele; i++) {
            int nums = Integer.parseInt(scanner.nextLine());
            sum += nums;
            if (i == 0) {
                maxele = nums;
            } else if (maxele < nums) {
                maxele = nums;
            }
        }
        int diff = sum - maxele;
        if (diff == maxele) {
            System.out.println("Yes, Sum =" + maxele);
        } else {
            System.out.println("No, diff=" +  Math.abs(sum - 2 * maxele));
        }
    }
}


