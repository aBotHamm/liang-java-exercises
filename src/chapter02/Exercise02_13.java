package chapter02;

import java.util.Scanner;

public class Exercise02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly savings amount: ");
        double monthlySavingsAmount = input.nextDouble();

        System.out.print("Enter the number of months: ");
        int numOfMonths = input.nextInt();

        System.out.print("Enter the monthly interest rate (e.g. 0.417 for 0.417%): ");
        double rate = input.nextDouble();
        rate = rate / 100;          // convert percentage to decimal

        double totalEarned = 0;

        for (int i = 1; i <= numOfMonths; i++) {
            totalEarned = (totalEarned + monthlySavingsAmount) * (1 + rate);
            System.out.printf("After month %d: $%.2f%n", i, totalEarned);
        }
    }
}