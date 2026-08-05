package chapter02;

import java.util.Scanner;

public class Exercise02_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet, feetToMeters;
        System.out.print("Enter a value for feet:");
        feet = input.nextDouble();

        feetToMeters = feet * (0.305);

        System.out.println(feet + " feet is " + feetToMeters + " meters");

    }
}
