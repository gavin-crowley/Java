package com.bmi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MetricBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilograms:");
        double weight = input.nextDouble();

        System.out.println("Enter height metres:");
        double heightMetres = input.nextDouble();

        input.close();

        double bmi = weight / Math.pow(heightMetres, 2);

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Your BMI is: " + df.format(bmi));
    }
}
