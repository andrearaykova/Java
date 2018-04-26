import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by andrearaykova on 10/14/17.
 */
public class LogsAggregator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        TreeMap<String, TreeMap<String, Integer>> info = new TreeMap<>();


        for (int i = 0; i < num ; i++) {

            String input = reader.readLine();
            String[] splitArr = input.split(" ");
            String ip = splitArr[0];
            String user = splitArr[1];
            int duration = Integer.parseInt(splitArr[2]);

            if (!info.containsKey(user)) {
                info.put(user, new TreeMap<>());
            }

            if (!info.get(user).containsKey(ip)) {
                info.get(user).put(ip, duration);
             } else {
                 info.get(user).put(ip, info.get(user).get(ip) + duration);
             }

        }

        List<String> orderName = new ArrayList<>();

        for (String name : info.keySet()) {
            System.out.print(name + ":");

            long count = info.get(name).values().stream().collect(Collectors.toList()).stream().reduce((e1,e2) -> e1 + e2).orElseGet(null);

            System.out.printf(" %d ", count);

            List<String> ips = new ArrayList<>();

            info.get(name).entrySet().forEach(e -> {
                ips.add(e.getKey());
            });

            int size = 1;
            System.out.print("[");
            for (String ip : ips) {
                if(size < ips.size()){
                    System.out.print(ip + ", ");
                }else{
                    System.out.println(ip + "]");
                }
                size++;
            };

        }




    }
}


