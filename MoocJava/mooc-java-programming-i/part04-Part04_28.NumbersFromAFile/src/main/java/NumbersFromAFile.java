
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                int num = Integer.valueOf(fileScanner.nextLine());
                if (num >= lowerBound && num <= upperBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Numbers: " + count);
    }

}

//
//Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Which file should have its contents printed?");
//        String fileNameInput = scanner.nextLine();
//
//        try (Scanner fileScanner = new Scanner(Paths.get(fileNameInput))) {
//            while (fileScanner.hasNextLine()) {
//                String row = fileScanner.nextLine();
//                System.out.println(row);
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
