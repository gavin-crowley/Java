
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int numOfNums = 0;
        int evenNums = 0;
        int oddNums = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            }

            sum += num;
            numOfNums++;
            
            if (num % 2 == 0) {
                evenNums++;
            }
            
            if (num % 2 != 0) {
                oddNums++;
            }
            
        }
        System.out.println("Thx!Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + numOfNums);
        System.out.println("Average:" + 1.0*sum/numOfNums);
        System.out.println("Even:" + evenNums);
        System.out.println("Odd:" + oddNums);
        
    }

}
