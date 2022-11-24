
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int longest = 0;
        String nameLongest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            int number = Integer.valueOf(parts[1]);
            sum = sum + number;
            count++;

            String name = parts[0];
            int currentNameLength = name.length();
            if (longest < currentNameLength) {
                longest = currentNameLength;
                nameLongest = name;
            }
        }

        if (count > 0) {
            System.out.println("Longest name: " + nameLongest);
            System.out.println("Average of the birth years: " + (1.0 * sum / count));
        } else {
            System.out.println("No input.");
        }
    }
}
