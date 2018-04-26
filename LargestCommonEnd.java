import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by andrearaykova on 10/6/17.
 */
public class LargestCommonEnd {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");

       String[] firstReverse = new String[first.length];
       String[] secondReverse = new String[second.length];

       int count = 0;
       for (int i = first.length - 1; i >= 0; i--) {
               firstReverse[count] = first[i];
               count++;
       }

       int count2 = 0;
       for (int i = second.length - 1; i >= 0 ; i--) {
           secondReverse[count2] = second[i];
           count2 ++;
       }

       int leftCount = calculateEqualEl(first, second);
       int rightCount = calculateEqualEl(firstReverse, secondReverse);
       int result = Math.max(leftCount, rightCount);
        System.out.println(result);




    }

    static int calculateEqualEl(String[] first, String[] second){
        int minLen = Math.min(first.length, second.length);

        int count = 0;
        for (int i = 0; i < minLen; i++) {
            if(first[i].equals(second[i])){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
