
import java.util.*;

/**
 * Created by andrearaykova on 10/12/17.
 */
public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        String[] words = input.split("\\s+");

        LinkedHashMap<String, Integer> count = new LinkedHashMap<>() ;


        for (int i = 0; i < words.length; i++) {
            String num = words[i];

            if (count.containsKey(num)) {
                int currentCount = count.get(num);
                currentCount++;
                count.put(num, currentCount);
            } else {
                count.put(num, 1);
            }
        }

        String result = "";
        for (String word : count.keySet()) {
            int occurencies = count.get(word);

            if (occurencies % 2 != 0)
                result += word + ", ";
        }

        System.out.println(result.substring(0, result.length() - 2));

    }
}
