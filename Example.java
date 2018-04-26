import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by andrearaykova on 10/12/17.
 */
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> dict = new HashMap<>();
        dict.put(50, "pesho");
        dict.put(60, "gosho");
        dict.put(70, "kiro");
        dict.put(80, "mimi");

        for (Map.Entry<Integer, String> item : dict.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

    }
}
