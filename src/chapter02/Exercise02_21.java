package chapter02;

import java.util.Scanner;

public class Exercise02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        double numYears = input.nextDouble();

        double futureInvestmentValue = investmentAmount *  (Math.pow((1 + ((interestRate/12)/100)),(numYears*12)));        ;

        System.out.print("Future value is " + futureInvestmentValue);

    }
}
