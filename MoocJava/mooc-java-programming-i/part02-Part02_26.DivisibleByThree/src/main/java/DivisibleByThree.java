
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = 0; beginning <= end; beginning++) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
            }
        }
    }

}
