package chapter05;

import java.util.Scanner;

public class Exercise05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter an integer: ");
        int num2 = input.nextInt();

        int lowest = 0;

        if (num1 < num2) {
            lowest = num1;
        } else if (num1 > num2) {
            lowest = num2;
        } else
            lowest = num2;

        int gcd = lowest;
        while (num1 % gcd != 0 || num2 % gcd != 0) {
            gcd--;
        }

        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}