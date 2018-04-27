import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by andrearaykova on 9/29/17.
 */
public class VowelDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        char n = scanner.nextLine().charAt(0);

        switch (n) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':

                System.out.println("digit");
                break;

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':

                System.out.println("vowel");
                break;

            default:
                System.out.println("other");
                break;
        }


    }

}

