import java.util.Scanner;

/**
 * Created by andrearaykova on 3/8/17.
 */
public class money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bitkoni = Double.parseDouble(scanner.nextLine());
        double uana = Double.parseDouble(scanner.nextLine());
        double komisionna = Double.parseDouble(scanner.nextLine());

      double onebitkoni = bitkoni * 1168;
      double oneeuana = uana * 0.15;
        oneeuana = oneeuana * 1.76;
      double evro = (onebitkoni + oneeuana) / 1.95;
      komisionna = evro   / 20;
      double result = evro - ((evro * komisionna) / 100 );
        System.out.println(result);





    }
}
