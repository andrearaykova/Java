import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by andrearaykova on 11/5/17.
 */
public class Entertrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> train = new ArrayList<>();
        int locoPower = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("All ofboard")) {
            int currentWagon = Integer.parseInt(input);
            train.add(currentWagon);

            int currentSum = train.size();

            if (currentSum >locoPower){
                int currentAvg = currentSum / train.size();
                int currentNearest = train.get(0);
                int currentDiff = Math.abs(currentNearest = currentAvg);

                for (int i = 1; i < train.size(); i++) {
                    int diff = Math.abs(train.get(i) - currentAvg);
                    if (diff < currentDiff) {
                        currentDiff = diff;
                        currentNearest = train.get(i);
                    }

                }
                train.remove(currentNearest);

            }
            input = scanner.nextLine();

        }
        train.sort(Comparator.reverseOrder());
        train.add(locoPower);

        System.out.println(train);

    }
}
