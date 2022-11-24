
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String nameOldest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int number = Integer.valueOf(parts[1]);
            String name = parts[0];
            if (oldest < number) {
                oldest = number;
                nameOldest = name;
            }
        }

        if (oldest > 0) {
//            System.out.println("Age of the oldest: " + oldest);
            System.out.println("Name of the oldest: " + nameOldest);
        } else {
            System.out.println("No input.");
        }

    }
}
