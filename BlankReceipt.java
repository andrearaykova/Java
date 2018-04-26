import java.util.Scanner;

/**
 * Created by andrearaykova on 10/2/17.
 */
public class BlankReceipt {

    static void printHeader () {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");

    }
    static void printBody () {
        System.out.println("Charged to____________________\n" +
                "Received by___________________");
    }
    static void printFoter () {
        System.out.println("------------------------------\n" +
                "© SoftUni");
    }




    public static void main(String[] args) {

        printHeader();
        printBody();
        printFoter();




        }

    }

