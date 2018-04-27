import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by andrearaykova on 9/20/17.
 */
public class restaurantdiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsize = Integer.parseInt(scanner.nextLine());
        String packagee = scanner.nextLine();

        double price1 = 0;
        double price2 = 0;
        double disc = 0;
        double price = price1 + price2;
        price = price - (price * disc);
        price = price / groupsize;
        double discount = price;
        DecimalFormat newFormat = new DecimalFormat("#0.00");


        if (groupsize <= 50) {

            if (packagee.equals("Normal")) {
                price1 = 2500;
                price2 = 500;
                disc = 0.05;
                price = price1 + price2;
                price = price - (price * disc);
                price = price / groupsize;
                discount = price;

                System.out.println("We can offer you the Small Hall");
                System.out.println("The price per person is " + newFormat.format(discount) + "$");

            }
            if (packagee.equals("Gold")) {
                price1 = 2500;
                price2 = 750;
                disc = 0.1;
                price = price1 + price2;
                price = price - (price * disc);
                price = price / groupsize;
                discount = price;

                System.out.println("We can offer you the Small Hall");
                System.out.println("The price per person is " + newFormat.format(discount) + "$");
            }
            if (packagee.equals("Platinum")) {
                price1 = 2500;
                price2 = 1000;
                disc = 0.15;
                price = price1 + price2;
                price = price - (price * disc);
                price = price / groupsize;
                discount = price;

                System.out.println("We can offer you the Small Hall");
                System.out.println("The price per person is " + newFormat.format(discount) + "$");
            }
        }
            else if (groupsize > 50 && groupsize <= 100) {

            if (packagee.equals("Normal")) {
                price1 = 5000;
                price2 = 500;
                disc = 0.05;
                price = price1 + price2;
                price = price - (price * disc);
                price = price / groupsize;
                discount = price;

                System.out.println("We can offer you the Terrace");
                System.out.println("The price per person is " + newFormat.format(discount) + "$");
            }
            if (packagee.equals("Gold")) {
                price1 = 5000;
                price2 = 750;
                disc = 0.1;
                price = price1 + price2;
                price = price - (price * disc);
                price = price / groupsize;
                discount = price;

                System.out.println("We can offer you the Terrace");
                System.out.println("The price per person is " + newFormat.format(discount) + "$");
            }


            if (packagee.equals("Platinum")) {
                price1 = 5000;
                price2 = 1000;
                disc = 0.15;
                price = price1 + price2;
                price = price - (price * disc);
                price = price / groupsize;
                discount = price;

                System.out.println("We can offer you the Terrace");
                System.out.println("The price per person is " + newFormat.format(discount) + "$");

            }
        }
        else if (groupsize > 100 && groupsize <= 120) {
                    if (packagee.equals("Normal")) {
                        price1 = 7500;
                        price2 = 500;
                        disc = 0.05;
                        price = price1 + price2;
                        price = price - (price * disc);
                        price = price / groupsize;
                        discount = price;

                        System.out.println("We can offer you the Great Hall");
                        System.out.println("The price per person is " + newFormat.format(discount) + "$");
                    }
                    if (packagee.equals("Gold")) {
                        price1 = 7500;
                        price2 = 750;
                        disc = 0.1;
                        price = price1 + price2;
                        price = price - (price * disc);
                        price = price / groupsize;
                        discount = price;

                        System.out.println("We can offer you the Great Hall");
                        System.out.println("The price per person is " + newFormat.format(discount) + "$");
                    }
                    if (packagee.equals("Platinum")) {
                        price1 = 7500;
                        price2 = 1000;
                        disc = 0.15;
                        price = price1 + price2;
                        price = price - (price * disc);
                        price = price / groupsize;
                        discount = price;

                        System.out.println("We can offer you the Great Hall");
                        System.out.println("The price per person is " + newFormat.format(discount) + "$");
                    }
        }
        else {
                    System.out.println("We do not have an appropriate hall.");
                }

            }
        }




