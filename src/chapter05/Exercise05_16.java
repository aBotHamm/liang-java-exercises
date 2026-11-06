package chapter05;

import java.util.Scanner;

public class Exercise05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int d = 2;

        while (number != 1) {
            if (number % d == 0) {
                System.out.print(d + " ");
                number = number / d;
            } else
                d++;
        }
    }
}
