package chapter02;

import java.util.Scanner;

public class Exercise02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount as an entire integer (e.g. $11.56 is 1156): ");
        int amount = input.nextInt();

        int remainingAmount = amount;

        // Find the number of dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of dollars
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount $" + (amount / 100.0) + " consists of");        System.out.println(numberOfDollars + " dollars");
        System.out.println(numberOfQuarters + " quarters");
        System.out.println(numberOfDimes + " dimes");
        System.out.println(numberOfNickels + " nickels");
        System.out.println(numberOfPennies + " pennies");

    }
}
