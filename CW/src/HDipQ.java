import java.util.Scanner;

public class HDipQ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] seatType = {"A", "B", "C"};
        int[] numberSold = new int[3];
        double[] ticketPrice = new double[3];

        for (int i = 0; i < seatType.length; i++) {
            System.out.println("Enter number of " + seatType[i] + " seats sold: ");
            numberSold[i] = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter price of " + seatType[i] + " tickets: ");
            ticketPrice[i] = Double.valueOf(scanner.nextLine());
        }


        double totalSales = 0;
        for (int i = 0; i < 3; i++) {
            totalSales += numberSold[i] * ticketPrice[i];
        }

        System.out.println("            Tickets Sold    Price per Ticket");
        System.out.println("            ------------    ----------------");
        System.out.println(seatType[0] + " Tickets:     " + numberSold[0] + "               " + ticketPrice[0]);
        System.out.println(seatType[1] + " Tickets:     " + numberSold[1] + "               " + ticketPrice[1]);
        System.out.println(seatType[2] + " Tickets:     " + numberSold[2] + "               " + ticketPrice[2]);
        System.out.println("");
        System.out.println("Total Sales: $ " + totalSales);
    }
}


