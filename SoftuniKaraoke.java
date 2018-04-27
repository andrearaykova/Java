import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by andrearaykova on 10/20/17.
 */
public class SoftuniKaraoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> participants = Arrays.stream(scanner.nextLine().split(", "))
                 .map(Integer::valueOf)
                 .collect(Collectors.toList());

        List<Integer> songs = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        LinkedHashMap<String,LinkedHashMap<String,String>> all = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("dawn")) {

            String[] allSongs = command.split(", ");






            command = scanner.nextLine();
        }



    }
}
