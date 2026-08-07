package chapter02;

import java.util.Scanner;

public class Exercise02_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double waterInKG, initialTemp, finalTemp, energyNeeded;
        System.out.print("Enter the amount of water in kilograms: ");
        waterInKG = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        initialTemp = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        finalTemp = input.nextDouble();
        energyNeeded = waterInKG * (finalTemp - initialTemp) * 4184;
        System.out.println("The energy needed is " + energyNeeded);

    }
}
