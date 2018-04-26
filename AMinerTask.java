import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by andrearaykova on 10/13/17.
 */
public class AMinerTask {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Integer> minerTask = new LinkedHashMap<>();
        List<String> data = new ArrayList<>();

        String input = reader.readLine();

        while (!input.equals("stop")){
            data.add(input);
            input = reader.readLine();
        }

        for (int i = 0; i < data.size(); i += 2) {

            String resource = data.get(i);
            int quantity = Integer.parseInt(data.get(i + 1));

            if (!minerTask.containsKey(resource)) {
                minerTask.put(resource,quantity);
            } else {
                minerTask.put(resource,minerTask.get(resource) + quantity);
            }

        }

        minerTask.entrySet().forEach(e -> {
            System.out.printf("%s -> %d\n",e.getKey(),e.getValue());
        });

      // while (true) {
      //     String resource = reader.readLine();

      //     if(resource.equals("stop")){
      //         break;
      //     }

      //     Integer quantity = Integer.parseInt(reader.readLine());

      //     if(!minerTask.containsKey(resource)){
      //         minerTask.put(resource, quantity);
      //     }else{
      //         minerTask.put(resource, minerTask.get(resource) + quantity);
      //     }
      // }

      // for (Map.Entry<String, Integer> stringIntegerEntry : minerTask.entrySet()) {
      //     System.out.printf("%s -> %d\n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
      // }

    }
}
