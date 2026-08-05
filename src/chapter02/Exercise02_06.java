package chapter02;

import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int sum = 0;

        // Extract and add the last digit
        sum += number % 10;
        number /= 10;

        // Extract and add the next digit
        sum += number % 10;
        number /= 10;

        // Extract and add the final digit
        sum += number % 10;

        System.out.println("The sum of the digits is " + sum);
    }
}