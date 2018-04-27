import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by andrearaykova on 10/27/17.
 */
public class CameraView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] num = scanner.nextLine().split(" ");
        int m = Integer.parseInt(num[0]);
        int n = Integer.parseInt(num[1]);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?:\\|\\<)\\|*(.*?)(?:(?=$|\\|))");

        Matcher matcher = pattern.matcher(text);

        List<String> stringList = new ArrayList<>();

        while (matcher.find()){
            String str = "";
            String word = matcher.group(1);

            int count = 1;
            for (int i = m; i < word.length(); i++) {
                if(count > n){
                    break;
                }

                str += word.charAt(i);
                count++;
            }

            stringList.add(word);
        }

        String result = "";

        for (int i = 0; i < stringList.size(); i++) {
            result += stringList.get(i) + ", ";
        }

        System.out.println(result.substring(0, result.length() - 2));
    }
}
