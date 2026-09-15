package chapter05;

import java.util.Scanner;

public class Exercise05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveNumbers = 0;
        int negativeNumbers = 0;
        double total = 0;

        System.out.print("Enter an integer, the input ends if it is a 0: ");
        int number = input.nextInt();

        while (number != 0) {
            if (number < 0) {
                negativeNumbers++;
                total = total + number;
            } else {
                positiveNumbers++;
                total = total + number;
            }
            number = input.nextInt();

        }
        if (positiveNumbers + negativeNumbers == 0)
            System.out.print("No numbers are entered except 0");
        else {
            System.out.print("The number of positives is " + positiveNumbers);
            System.out.print("\nThe number of negatives is " + negativeNumbers);
            System.out.print("\nThe total is " + total);
            System.out.print("\nThe average is " + total / (positiveNumbers + negativeNumbers));
        }
    }
}