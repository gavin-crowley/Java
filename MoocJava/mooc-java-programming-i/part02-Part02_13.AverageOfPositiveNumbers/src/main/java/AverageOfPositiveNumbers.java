
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveTotal = 0;
        int numPositives = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                positiveTotal = positiveTotal + num;
                numPositives = numPositives + 1;
            }

        }
        if (numPositives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * positiveTotal / numPositives);
        }
    }
}
