
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputValues = 0;
        int valuesTotal = 0;
        int average = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            numInputValues = numInputValues + 1;
            valuesTotal = valuesTotal + num;
            

        }
        System.out.println("Average of the numbers: " + 1.0*valuesTotal/numInputValues);
    }
}
