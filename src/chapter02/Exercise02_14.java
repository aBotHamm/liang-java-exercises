package chapter02;

import java.util.Scanner;

public class Exercise02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double BMI, poundsToKG, inchesToMeters;

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        poundsToKG = pounds * .45359237;

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        inchesToMeters = height * .0254;

        BMI = (poundsToKG / Math.pow(inchesToMeters,2));
        System.out.print("BMI is " + BMI);

    }
}
