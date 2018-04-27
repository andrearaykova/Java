
import javafx.beans.binding.ObjectExpression;

import java.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

/**
 * Created by andrearaykova on 10/20/17.
 */
public class Homework {
    public static void main(String[] args) {



        try {
            BufferedReader reader = Files.newBufferedReader("Andreas-MacBook-Pro:Desktop andrearaykova$ \\Homework.txt");
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

//      List<String> array = Files.readAllLines("Andreas-MacBook-Pro:Desktop andrearaykova$ \\Homework.txt", Charset.defaultCharset());
    }
}
