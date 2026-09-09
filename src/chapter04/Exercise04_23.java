package chapter04;

import java.util.Scanner;

public class Exercise04_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scanner.next();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = scanner.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = scanner.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = scanner.nextDouble();

        double grossPay;

        if (hours <= 40) {
            grossPay = hours * rate;
        } else
            grossPay = (40 * rate) + ((hours - 40) * rate * 1.5);

        double federalWithholdingDeduction = grossPay * federalTax;
        double stateWithholdingDeduction = grossPay * stateTax;
        double totalDeductions = federalWithholdingDeduction + stateWithholdingDeduction;
        double netPay = grossPay - totalDeductions;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.printf("Pay Rate: $%.2f%n", rate);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("Federal Withholding (%.1f%%): $%.2f%n", federalTax * 100, federalWithholdingDeduction);
        System.out.printf("State Withholding (%.1f%%): $%.2f%n", stateTax * 100, stateWithholdingDeduction);
        System.out.printf("Total Deduction: $%.2f%n", totalDeductions);
        System.out.printf("Net Pay: $%.2f%n", netPay);
    }
}