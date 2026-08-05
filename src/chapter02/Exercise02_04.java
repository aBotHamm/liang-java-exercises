package chapter02;

import java.util.Scanner;

public class Exercise02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pounds, poundsToKilograms;

        System.out.print("Enter a number in pounds: ");
        pounds = input.nextDouble();

        poundsToKilograms = .454 * pounds;

        System.out.println(pounds + " pounds is " + poundsToKilograms + " kilograms");
    }
}
