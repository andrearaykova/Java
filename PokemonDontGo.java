import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String[] input = reader.readLine().split("\\s+");
//
//        List<Integer> nums = new ArrayList<Integer>();
//
//        for (String anInput : input) {
//            nums.add(Integer.parseInt(anInput));
//        }

        List<Integer> nums = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        while (nums.size() > 0) {
            int index = Integer.parseInt(reader.readLine());
            int element = 0;
            if (index < 0) {
                element = nums.remove(0);
                int last = nums.get(nums.size() - 1);
                nums.add(0, last);
            } else if (index >= nums.size()) {
                element = nums.remove(nums.size() - 1);
                int first = nums.get(0);
                nums.add(first);
            } else {
                element = nums.remove(index);
            }

            sum += element;

            for (int i = 0; i < nums.size(); i++) {
                int current = nums.get(i);

                if (current <= element) {
                    nums.set(i, current + element);
                } else {
                    nums.set(i, current - element);
                }
            }
        }
        System.out.println(sum);
    }
}
