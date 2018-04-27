import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.Scanner;

/**
 * Created by andrearaykova on 3/13/17.
 */
public class stupidpassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
         int l = Integer.parseInt(scanner.nextLine());

         char r = (char)97;


        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (char k = 'a' ; k < 'a' + l; k++) {
                    for (char m = 'a'  ;m < 'a' + l; m++) {
                        for (int o = Math.max(i,j) + 1; o <= n ; o++) {
                            if (i < n && j < n) {
                                System.out.print(i);
                                System.out.print(j);
                                System.out.print(k);
                                System.out.print(m);
                                System.out.print(o);
                                System.out.print(" ");

                            }

                            
                        }
                        
                    }
                    
                }
                
            }
            
        }

    }
}
