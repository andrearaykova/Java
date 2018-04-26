import java.util.Scanner;

/**
 * Created by andrearaykova on 2/15/17.
 */
public class done {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
                int k = 0;
                if (n%2!=0)
                {
                    k = 1;
                }
                //Upper part
                for (int i = 0; i < n/2+k; i++)
                {
                    if (n%2==0)
                    {
                        System.out.println(doMagic("-", (n / 2) - 1 - i) + doMagic("*", 1) +
                               doMagic("-", 2 * i) + doMagic("*", 1) +
                                doMagic("-", (n / 2) - 1 - i));
                    }
                    else
                    {
                        if (i==0)
                        {
                            System.out.println(doMagic("-", (n / 2) ) + doMagic("*", 1) +
                                    doMagic("-", (n / 2) ));
                        }
                        else
                        {
                            System.out.println(doMagic("-", (n / 2) - i) + doMagic("*", 1) +
                                    doMagic("-", 2 * i-1) + doMagic("*", 1) +
                                    doMagic("-", (n / 2) - i));
                        }

                    }


                }
                //Lower part
                for (int i = 0; i < n / 2-1+k; i++)
                {

                    if (n % 2 == 0)
                    {
                        System.out.println(doMagic("-", 1 + i) + doMagic("*", 1) +
                                doMagic("-", n - 4 - 2 * i) + doMagic("*", 1) +
                                doMagic("-", 1 + i));
                    }
                    else
                    {
                        if (i == n/2-1)
                        {
                            System.out.println(doMagic("-", (n-1)/2) + doMagic("*", 1) +
                                    doMagic("-", (n - 1) / 2));
                        }
                        else
                        {
                            System.out.println(doMagic("-", 1 + i) + doMagic("*", 1) +
                                    doMagic("-", n - 4 - 2 * i) + doMagic("*", 1) +
                                    doMagic("-", 1 + i));
                        }

                    }

                }
            }


            public static String doMagic(String text,int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
        output = output + text;

        }
        return output;
        }
        }
