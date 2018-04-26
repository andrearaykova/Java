import java.util.Scanner;

/**
 * Created by andrearaykova on 10/3/17.
 */
public class cubeProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();


        if (name.equals("face")) {
            double facecube = Math.sqrt(2 * (num * num));

            System.out.printf("%.2f",facecube);

        } else if (name.equals("space")) {
            double spacecube = Math.sqrt(3 * (num * num));

            System.out.printf("%.2f",spacecube);

        } else if (name.equals("volume")) {
            double volumeCube = num * num * num;

            System.out.printf("%.2f",volumeCube);

        } else if (name.equals("area")) {
            double areaCube = 6 * (num * num);

            System.out.printf("%.2f",areaCube);

        }




    }

}
