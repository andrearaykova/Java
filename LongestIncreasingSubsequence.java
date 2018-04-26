import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by andrearaykova on 10/11/17.
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // int[] num = Arrays.stream(scanner.nextLine().split("\\s+"))
       //         .mapToInt(Integer::parseInt)
       //         .toArray();

        ArrayList<Integer> num = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(LIS(num));
    } static Integer[] LIS(Integer[] A) {
                int[] m = new int[A.length];
                //Arrays.fill(m, 1);//not important here
                for (int x = A.length - 2; x >= 0; x--) {
                    for (int y = A.length - 1; y > x; y--) {
                        if (A[x] < A[y] && m[x] <= m[y]) {
                            m[x]++;//or use m[x] = m[y] + 1;
                        }
                    }
                }
                int max = m[0];
                for (int i = 1; i < m.length; i++) {
                    if (max < m[i]) {
                        max = m[i];
                    }
                }
                ArrayList<Integer> result = new ArrayList<Integer>();
                for (int i = 0; i < m.length; i++) {
                    if (m[i] == max) {
                        result.add(A[i]);
                        max--;
                    }
                }
                return result.toArray(new Integer[0]);
            }
        }


