import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by andrearaykova on 10/13/17.
 */
public class Phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command = reader.readLine();

        Map<String,String> phonebook = new HashMap<>();

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

            command = reader.readLine();
        }



        }
    }


