import java.util.Scanner;

/**
 * Created by andrearaykova on 12/17/16.
 */
public class p01_SquareArea {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("a= ");
        int a= Integer.parseInt(console.nextLine());
        int area=a*a;
        System.out.println("Square= " + area);



    }
}
