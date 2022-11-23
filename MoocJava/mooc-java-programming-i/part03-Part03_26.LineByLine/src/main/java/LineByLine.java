
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String input = scanner.nextLine();
//        if (input.equals("")) {
//            return;
//        }
//
//        String[] pieces = input.split(" ");
//
//        for (int i = 0; i < pieces.length; i++) {
//            System.out.println(pieces[i]);
//        }
        while (true) {
            String userInput = scanner.nextLine();

            String[] splitStringArray = userInput.split(" ");

            for (String e : splitStringArray) {
                System.out.println(e);
            }
            if (userInput.equals("")) {
                break;
            }

        }
    }
}
