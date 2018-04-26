import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by andrearaykova on 10/10/17.
 */
public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> num = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());


        String line = scanner.nextLine();

        while (true) {

            String[] tokens = line.split("\\s+");

            switch (tokens[0]) {
                case "Delete":
                    int index = Integer.parseInt(tokens[1]);
                    //int element = Integer.parseInt(tokens[1]);

                    num = num.stream().filter(e -> e != index).collect(Collectors.toList());

//                    List<Integer> result = new ArrayList<>();
//
//                    for (int i = 0; i < num.size(); i++) {
//                         if(num.get(i) != index){
//                             result.add(num.get(i));
//                         }
//                    }
//                    num.clear();
//                    num.addAll(result);
                    break;

                case "Insert":
                    index = Integer.parseInt(tokens[2]);
                    int element = Integer.parseInt(tokens[1]);
                    num.add(index, element);
                    break;

            }

            if (line.equals("Odd") || line.equals("Even")) {

                List<Integer> result = line.equals("Odd") ? num.stream().filter(e -> e % 2 ==1).collect(Collectors.toList()) :
                        num.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

                for (int i = 0; i < result.size(); i++) {
                    if(i < result.size() - 1) {
                        System.out.print(result.get(i) + " ");
                    }else{
                        System.out.println(result.get(i));
                    }
                }

//                if (line.equals("Odd")) {
//                    for (int i = 0; i < num.size(); i++) {
//                        if (num.get(i) % 2 == 1) {
//                            System.out.print(num.get(i) + " ");
//                        }
//                    }
//                } else {
//                    for (int i = 0; i < num.size(); i++) {
//                        if (num.get(i) % 2 == 0) {
//                            System.out.print(num.get(i) + " ");
//                        }
//                    }
//                }

                return;
            }


            line = scanner.nextLine();
        }


        }
    }


