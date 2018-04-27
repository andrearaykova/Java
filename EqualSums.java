import java.util.*;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();

        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }

            if (i < numbers.length - 1) {

                for (int j = i + 1; j < numbers.length; j++) {
                    rightSum += numbers[j];
                }

            } else {
                rightSum = 0;
            }
            if (rightSum == leftSum){
                index = i;
            }
        }
        if (index < 0){
            System.out.println("no");
        }else{
            System.out.println(index);
        }
    }
}