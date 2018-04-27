import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int originalN = n;

        while (n >= m){
            n -= m;
            count++;

            if (n == originalN * 0.5 && y != 0){
                n /= y;
            }
        }
        System.out.println(n);
        System.out.println(count);
    }
}
