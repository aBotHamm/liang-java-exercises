package chapter03;

import java.util.Scanner;

public class Exercise03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        System.out.print("Enter 0 to convert from dollars to RMB and 1 vice versa: ");
        int userChoice = input.nextInt();

        if (userChoice == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollarAmount = input.nextDouble();
            double currency = exchangeRate * dollarAmount;
            System.out.printf("$%.2f is %.2f yuan%n", dollarAmount, currency);
        } else if (userChoice == 1) {
            System.out.print("Enter the RMB amount: ");
            double rmbAmount = input.nextDouble();
            double currency = rmbAmount / exchangeRate;
            System.out.printf("%.2f yuan is $%.2f%n", rmbAmount, currency);
        } else {
            System.out.println("Enter a valid choice");
        }
    }
}