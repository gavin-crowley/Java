
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        
        int total = 0;
        for (int i = 1; first <= last; first++) {
            total += first;
        }
        System.out.println("The sum is " + total);
    }
}
