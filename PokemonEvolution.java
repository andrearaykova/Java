import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PokemonEvolution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> inputMap = new LinkedHashMap<>();

        String input;

        while (!"wubbalubbadubdub".equals((input = reader.readLine()))) {
            String[] tokens = input.split(" -> ");

            if (tokens.length > 1) {
                inputMap.putIfAbsent(tokens[0],new ArrayList<>());
                String str = tokens[1] + " <-> " + tokens[2];
                inputMap.get(tokens[0]).add(str);
            } else if (inputMap.containsKey(tokens[0])){
                System.out.println("# " + tokens[0]);
                inputMap.get(tokens[0])
                        .forEach(System.out::println);
            }
        }
        inputMap.forEach((key,value) -> {
            System.out.println("# " + key);

            value.stream().sorted((first,second) -> {
                String firstNumAsString = first.split(" <-> ")[1];
                int firstNum = Integer.parseInt(firstNumAsString);

                String secondNumAsString = second.split(" <-> ")[1];
                int secondNum = Integer.parseInt(secondNumAsString);

                return Integer.compare(secondNum,firstNum);

            }).forEach(System.out::println);
        });
    }
}




//import java.util.ArrayList;
//
//import java.util.LinkedHashMap;
//import java.util.Scanner;
//
//
//
//public class PokemonEvolution {
//    static class Pok {
//        private String evolutionType;
//        private long evolutionIndex;
//
//        Pok(String evolutionType,long evolutionIndex){
//            this.evolutionType = evolutionType;
//            this.evolutionIndex = evolutionIndex;
//        }
//
//        public String getEvolutionType() {
//            return evolutionType;
//        }
//
//        public void setEvolutionType(String evolutionType) {
//            this.evolutionType = evolutionType;
//        }
//
//        public long getEvolutionIndex() {
//            return evolutionIndex;
//        }
//
//        public void setEvolutionIndex(long evolutionIndex) {
//            this.evolutionIndex = evolutionIndex;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        LinkedHashMap<String,ArrayList<Pok>> inputMap = new LinkedHashMap<>();
//
//        String input = scanner.nextLine();
//
//        while (!input.equals("wubbalubbadubdub")) {
//
//            if (!input.contains(" -> ")) {
//                if (inputMap.containsKey(input)) {
//                    System.out.println("# " + input);
//                    inputMap.get(input).forEach(e -> {
//
//                        System.out.println(e.getEvolutionType() + " <-> " + e.getEvolutionIndex());
//
//                    });
//                }
//
//            } else {
//
//            String[] tokens = input.split(" -> ");
//
//
//
//                String pokName = tokens[0];
//                String evoType = tokens[1];
//                long evoIndex = Long.parseLong(tokens[2]);
//
//                Pok pokemon = new Pok(evoType, evoIndex);
//
//                if (!inputMap.containsKey(pokName)) {
//                    inputMap.put(pokName, new ArrayList<>());
//                }
//                inputMap.get(pokName).add(pokemon);
//
//            }
//            input = scanner.nextLine();
//        }
//
//       inputMap.entrySet().forEach(e -> {
//           System.out.println("# " + e.getKey());
//           ArrayList<Pok> secondPart = inputMap.get(e.getKey());
//           secondPart.stream().sorted((e1,e2) -> Long.compare(e2.getEvolutionIndex(),e1.getEvolutionIndex())).forEach(s -> {
//               System.out.println(s.getEvolutionType() + " <-> " + s.getEvolutionIndex());
//           });
//       });
//    }
//}
//
