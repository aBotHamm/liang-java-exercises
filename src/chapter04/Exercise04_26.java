package chapter04;

import java.util.Scanner;

public class Exercise04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount, for example 11.56: ");
        String amountStr = input.nextLine();

        int decimalIndex = amountStr.indexOf('.');

        String dollarPart = amountStr.substring(0, decimalIndex);
        String centsPart = amountStr.substring(decimalIndex + 1);

        int dollars = Integer.parseInt(dollarPart);
        int cents = Integer.parseInt(centsPart);

        int remainingAmount = dollars * 100 + cents;

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

        // Find the number of pennies
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount $" + dollarPart + "." + centsPart + " consists of");
        System.out.println(numberOfDollars + " dollars");
        System.out.println(numberOfQuarters + " quarters");
        System.out.println(numberOfDimes + " dimes");
        System.out.println(numberOfNickels + " nickels");
        System.out.println(numberOfPennies + " pennies");
    }
}