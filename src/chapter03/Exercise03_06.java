package chapter03;

import java.util.Scanner;

public class Exercise03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter weight in lbs
        System.out.print("Enter the weight in pounds: ");
        double weight = input.nextDouble();

        // prompt the user to enter height in inches
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KG_PER_LB = .45359237;
        final double METERS_PER_INCH = .0254;

        // compute BMI
        double weightInKg = weight * KG_PER_LB;
        double feetInInches = feet * 12;
        double totalInches = feetInInches + inches;
        double heightInMeters = totalInches * METERS_PER_INCH;
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // display results
        System.out.println("BMI is " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
