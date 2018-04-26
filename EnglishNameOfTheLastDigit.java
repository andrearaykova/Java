import java.util.Scanner;

/**
 * Created by andrearaykova on 10/3/17.
 */
public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();

        LastDigit(num);

    }
    static void LastDigit (String lastDigit) {

        switch (Integer.parseInt(lastDigit.substring(lastDigit.length() -1))) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 0:
                System.out.println("zero");
                break;
        }
    }
}
