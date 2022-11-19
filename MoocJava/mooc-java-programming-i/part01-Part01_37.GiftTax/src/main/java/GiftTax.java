
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Value of the gift?");
//        int gift = Integer.valueOf(scan.nextLine());
//
//        if (gift >= 5000) {
//            System.out.println("Tax: " + (100 + ((gift - 5000) * 0.08)));
//        } else if (gift >= 25000) {
//            System.out.println("Tax: " + (1700 + ((gift - 25000) * 0.1)));
//        } else if (gift >= 55000) {
//            System.out.println("Tax: " + (4700 + ((gift - 55000) * 0.12)));
//        } else if (gift >= 200000) {
//            System.out.println("Tax: " + (22100 + ((gift - 200000) * 0.15)));
//        } else if (gift >= 1000000) {
//            System.out.println("Tax: " + (142100 + ((gift - 1000000) * 0.17)));
//        } else {
//            System.out.println("No tax!");
//        }
//    }
        System.out.println("Value of the gift?");
        double userInput = Double.valueOf(scan.nextLine());

        double taxAmount = 0;

        if (userInput >= 5_000 && userInput < 25_000) {

            taxAmount = 100 + ((userInput - 5_000) * 0.08);

        } else if (userInput >= 25_000 && userInput < 55_000) {

            taxAmount = 1_700 + ((userInput - 25_000) * 0.10);

        } else if (userInput >= 55_000 && userInput < 200_000) {

            taxAmount = 4_700 + ((userInput - 55_000) * 0.12);

        } else if (userInput >= 200_000 && userInput < 1_000_000) {

            taxAmount = 22_100 + ((userInput - 200_000) * 0.15);

        } else if (userInput >= 1_000_000) {
            taxAmount = 142_100 + ((userInput - 1_000_000) * 0.17);

        }
        // 1_100_000   159_100.0 

        if (taxAmount == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + taxAmount);
        }

    }
}
