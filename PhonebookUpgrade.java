import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by andrearaykova on 10/13/17.
 */
public class PhonebookUpgrade {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command = reader.readLine();

        TreeMap<String,String> phonebook = new TreeMap<>();

        while (!command .equals("END")) {

            String[] tokens = command.split("\\s+");

            if (tokens[0].equals("A")) {
                phonebook.put(tokens[1],tokens[2]);
            }
            else if(tokens[0].equals("S"))

                if (!phonebook.containsKey(tokens[1])){
                    System.out.println("Contact " + tokens[1] + " does not exist.");
                }
                else {
                    System.out.println(tokens[1] + " -> " + phonebook.get(tokens[1]));
                }
            else if(command.equals("ListAll")){

//                for (Map.Entry<String, String> s : phonebook.entrySet()) {
//                    System.out.printf("%s -> %s\n", s.getKey(), s.getValue());
//                }

                phonebook.entrySet().forEach(s -> {
                    System.out.printf("%s -> %s\n", s.getKey(), s.getValue());
                });

            }

            command = reader.readLine();
        }




    }
}
