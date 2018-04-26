import java.util.Scanner;

/**
 * Created by andrearaykova on 1/14/17.
 */
public class Number09toText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        if (a == 1){
            System.out.println("one");

        } if (a==2){
            System.out.println("two");

        } if (a==3){
            System.out.println("three");

        } if (a==4){
            System.out.println("four");

        }if (a==5){
            System.out.println("five");

        }if (a==6){
            System.out.println("six");

        } if (a==7){
            System.out.println("seven");
        } if (a==8){
            System.out.println("eight");

        } if (a==9){
            System.out.println("nine");
        } if (a >= 10){
            System.out.println("number too big");
        }
    }
}
