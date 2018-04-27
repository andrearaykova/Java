import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * Created by andrearaykova on 3/18/17.
 */
public class doghouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthWall = Double.parseDouble(scanner.nextLine());
        double heighHouse = Double.parseDouble(scanner.nextLine());

        double str = widthWall * (widthWall/2) * 2;
        double backWall = ((widthWall/2) * (widthWall/2)) + (((widthWall/2) * (heighHouse-widthWall/2))/2);
        double enter = (widthWall/5) * (widthWall/5);
        double front = backWall - enter;
        double allWalls = str + backWall + front;
        double green = allWalls / 3;
        double roof = widthWall * (widthWall/2) * 2;
        double red = roof / 5;

        System.out.printf("%.2f",green);
        System.out.println();
        System.out.printf("%.2f",red);
    }
}
