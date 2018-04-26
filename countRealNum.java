import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;



public class countRealNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> count = new TreeMap<Double, Integer>() {
        };

        for (int i = 0; i < nums.length; i++) {
            double num = nums[i];


            if (count.containsKey(num)) {
                int currentCount = count.get(num);
                currentCount++;
                count.put(num, currentCount);
            } else {
                count.put(num, 1);
            }

        }
/// sravnqva stoinostite
        DecimalFormat format = new DecimalFormat("#.##");
        for (Double num : count.keySet()) {
            System.out.println(format.format(num) + " -> " + count.get(num));


        }

        //  count.entrySet().stream().sorted((a,b) -> Double.compare(a.getKey(),b.getKey())).forEach(pair -> {
        //      System.out.println(pair.getKey() + " -> " + pair.getValue());

        //  });
    }
}

