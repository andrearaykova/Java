import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by andrearaykova on 10/14/17.
 */
public class PopulationCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String,LinkedHashMap<String,Long>> countriesPop = new LinkedHashMap<>();
        LinkedHashMap<String,Long> totalPopulation = new LinkedHashMap<>();

        while (true) {
            String[] input = reader.readLine().split("\\|");

            if (input[0].equals("report")){
                break;
            }

            String country = input[1];
            String city = input[0];
            long population = Long.parseLong(input[2]);

            if (!countriesPop.containsKey(country)) {
                countriesPop.put(country,new LinkedHashMap<>());
                totalPopulation.put(country,population);
            } else {
                totalPopulation.put(country,totalPopulation.get(country) + population);
            }

            if (!countriesPop.get(country).containsKey(city)){
                countriesPop.get(country).put(city,population);
            } else {
                countriesPop.get(country).put(city,countriesPop.get(country).get(city) + population);
            }

        }

        ArrayList<String> countries = new ArrayList<>();
        totalPopulation
                .entrySet()
                .stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(c -> countries.add(c.getKey()));

        for (String country : countries) {
            System.out.printf("%s (total population: %d)\n",country,totalPopulation.get(country));

            LinkedHashMap<String,Long> cities = countriesPop.get(country);
            cities.entrySet().stream()
                    .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(c -> System.out.printf("=>%s: %d\n",c.getKey(),c.getValue()));
        }
    }
}
