import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilograms:");
        int weight = input.nextInt();

        System.out.println("Enter height in metres:");
        double height = input.nextDouble();

        double bmi = weight / Math.pow(height,2);

        System.out.println("Your BMI is: " + Math.round(bmi*100.0)/100.0);

    }
}

// comment
