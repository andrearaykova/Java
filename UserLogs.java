import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Created by andrearaykova on 10/13/17.
 */
public class UserLogs {
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String,LinkedHashMap<String,Integer>> users = new TreeMap<>();

        String input = reader.readLine();

        while (!input.equals("end")) {

            String[] splitArr = input.split(" ");
            String ip = splitArr[0].substring(splitArr[0].indexOf("=") + 1);
            String user = splitArr[2].substring(splitArr[2].indexOf("=") + 1);

           if (!users.containsKey(user)) {
               users.put(user,new LinkedHashMap<>());
           }

           if (!users.get(user).containsKey(ip)) {
               users.get(user).put(ip,1);
           } else {
               users.get(user).put(ip,users.get(user).get(ip) + 1);
           }
            input = reader.readLine();
        }

        for (String outerKey : users.keySet()) {
            System.out.println(outerKey + ":");

            LinkedHashMap<String,Integer> ipCount = users.get(outerKey);

            ipCount.entrySet().forEach(e -> {
                 if (count < ipCount.size() - 1){
                     System.out.printf("%s => %d, ",e.getKey(),e.getValue());
                 } else {
                     System.out.printf("%s => %d.\n",e.getKey(),e.getValue());
                 }
                 count++;
             });
            count = 0;
        }
    }
}
