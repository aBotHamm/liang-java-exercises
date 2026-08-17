package chapter0;

import java.util.Scanner;

public class Exercise03_07 {
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

        // Find the number of pennies
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount $" + (amount / 100.0) + " consists of");

        if (numberOfDollars == 0) {
        }
        //print nothing
        else if (numberOfDollars <= 1)
            System.out.println(numberOfDollars + " dollar");

        else
            System.out.println(numberOfDollars + " dollars");

        if (numberOfQuarters == 0) {
        }
        //print nothing
        else if (numberOfQuarters <= 1)
            System.out.println(numberOfQuarters + " quarter");

        else
            System.out.println(numberOfQuarters + " quarters");

        if (numberOfDimes == 0) {
        }
        //print nothing
        else if (numberOfDimes <= 1)
            System.out.println(numberOfDimes + " dime");

        else
            System.out.println(numberOfDimes + " dimes");

        if (numberOfNickels == 0) {
        }
        //print nothing
        else if (numberOfNickels <= 1)
            System.out.println(numberOfNickels + " nickel");

        else
            System.out.println(numberOfNickels + " nickels");

        if (numberOfPennies == 0) {
        }
        //print nothing
        else if (numberOfPennies <= 1)
            System.out.println(numberOfPennies + " penny");

        else
            System.out.println(numberOfPennies + " pennies");

        input.close();
    }
}