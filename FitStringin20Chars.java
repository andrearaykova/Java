import java.util.Scanner;

public class FitStringin20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder addStars = new StringBuilder(scanner.nextLine());
        String stars = "*";
        int sum = 21 - addStars.length();

        if (addStars.length() < 20) {
//            for (int i = addStars.length(); i < 20; i++) {
//                addStars.append(stars);
//            }

            System.out.println(addStars.append(newString("*", 20 - addStars.length())));
        } else if (addStars.length() > 20) {
            System.out.println(addStars.substring(0,20));
        } else {
            System.out.println(addStars);
        }


    }

    static StringBuilder newString(String symbol, int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(symbol);
        }

        return sb;
    }
}


