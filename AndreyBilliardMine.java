import java.util.*;

/**
 * Created by andrearaykova on 10/21/17.
 */
public class AndreyBilliardMine {
    private static double totalBill = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long num = Long.parseLong(scanner.nextLine());

        LinkedHashMap<String,Double> products = new LinkedHashMap<>();
        TreeMap<String,LinkedHashMap<String,Long>> orders = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            String[] tokens = scanner.nextLine().split("-");
            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            products.put(product,price);
        }
        String input = scanner.nextLine();
        while (!input.equals("end of clients")) {

            String[] info = input.split("-|,");
            String name = info[0];
            String food = info[1];
            Long count = Long.parseLong(info[2]);

            if (!products.containsKey(food)){
                input = scanner.nextLine();
                continue;
            }

            if (!orders.containsKey(name)) {
                orders.put(name,new LinkedHashMap<>());
            }
            if (!orders.get(name).containsKey(food)){
                orders.get(name).put(food,count);
            }else {
                orders.get(name).put(food,orders.get(name).get(food) + count);
            }

            input = scanner.nextLine();
        }
        orders.entrySet().forEach(e -> {
           System.out.println(e.getKey());
           LinkedHashMap<String,Long> inner = orders.get(e.getKey());
            final double[] bill = {0};
           inner.entrySet().forEach(s -> {
               System.out.printf("-- %s - %d\n",s.getKey(),s.getValue());
               bill[0] += s.getValue() * products.get(s.getKey());
           });
           double personBill = bill[0];
            totalBill += personBill;
           System.out.printf("Bill: %.2f\n",personBill);
        });
        System.out.printf("Total bill: %.2f\n",totalBill);
    }
}
