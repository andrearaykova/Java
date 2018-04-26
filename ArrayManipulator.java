import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by andrearaykova on 10/10/17.
 */
public class ArrayManipulator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      //  List<Integer> num = Arrays.stream(reader.readLine().split("\\s+"))
      //          .map(Integer::valueOf)
      //          .collect(Collectors.toList());

        List<Integer> num = new ArrayList<>();
        String[] nums = reader.readLine().split("\\s+");

        for (String nu : nums) {
            num.add(Integer.parseInt(nu));

        }


        String command = reader.readLine();

        while (!"print".equals(command)) {

            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "add":
                    int index = Integer.parseInt(tokens[1]);
                    int element = Integer.parseInt(tokens[2]);
                    num.add(index,element);
                    break;
                case "addMany":
                     index = Integer.parseInt(tokens[1]);
                     List<Integer> arr = Arrays.stream(tokens).skip(2)
                             .map(Integer::valueOf)
                             .collect(Collectors.toList());

                     num.addAll(index,arr);
                     break;
                case "contains":
                    element = Integer.parseInt(tokens[1]);
                    System.out.println(num.indexOf(element));
                    break;
                case "remove":
                    index = Integer.parseInt(tokens[1]);
                    num.remove(index);
                    break;
                case "shift":
                    int position = Integer.parseInt(tokens[1]);
                    Collections.rotate(num,position * -1);
                    break;
                case "sumPairs":
                    List<Integer>  temp = new ArrayList<>();
                    for (int i = 1; i < num.size(); i+=2) {
                        int first = num.get(i);
                        int second = num.get(i - 1);
                        temp.add(first + second);


                    }
                    if (num.size() % 2 != 0) {
                        temp.add(num.get(num.size()- 1));

                    }
                    num.clear();
                    num.addAll(temp);

            }



            command = reader.readLine();
        }
        System.out.println(num);
    }
}
