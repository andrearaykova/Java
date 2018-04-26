import java.util.Random;
import java.util.Scanner;

/**
 * Created by andrearaykova on 10/17/17.
 */
public class AdvertismentMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};

        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya",
                "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rand = new Random();

        for (int i = 0; i < num ; i++) {

            int phraseRand = rand.nextInt(phrases.length);
            int eventRand = rand.nextInt(events.length);
            int authorRand = rand.nextInt(authors.length);
            int citiesRand = rand.nextInt(cities.length);

            System.out.println(phrases[phraseRand] + " " + events[eventRand] + " "
                    + authors[authorRand] + " " + cities[citiesRand]);

        }


    }

}
