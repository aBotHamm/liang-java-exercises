package chapter05;

import java.util.Scanner;

public class Exercise05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        int numberOfMonths = numberOfYears * 12;
        double monthlyRate = (annualInterestRate / 100) / 12;
        double monthlyPayment = (loanAmount * monthlyRate)
                / (1 - (1 / Math.pow(1 + monthlyRate, numberOfMonths)));
        double totalPayment = monthlyPayment * numberOfMonths;

        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
        System.out.printf("Total Payment: %.2f%n%n", totalPayment);
        System.out.printf("%-10s%12s%12s%12s%n",
                "Payment#", "Interest", "Principal", "Balance");

        double balance = loanAmount;

        for (int i = 1; i <= numberOfMonths; i++) {
            double interest = monthlyRate * balance;
            double principal = monthlyPayment - interest;

            // Last month: pay off whatever is left so the balance ends at 0
            if (i == numberOfMonths) {
                principal = balance;
            }

            balance = balance - principal;

            System.out.printf("%-10d%12.2f%12.2f%12.2f%n",
                    i, interest, principal, balance);
        }
    }
}