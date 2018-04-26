import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

/**
 * Created by andrearaykova on 10/13/17.
 */
public class FixEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        LinkedHashMap<String,String> nameAndEmail = new LinkedHashMap<>();


        while (true) {
            String name = reader.readLine();

            if (name.equals("stop")) {
                break;
            }

            String email = reader.readLine();

            if (email.endsWith("bg")) {
                nameAndEmail.put(name, email);
            }
        }

        nameAndEmail.entrySet().forEach(e -> {
            System.out.println(e.getKey() + " -> " + e.getValue());
        });
    }
}