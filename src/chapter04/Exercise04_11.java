package chapter04;

import java.util.Scanner;

public class Exercise04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if (decimal < 0 || decimal > 15) {
            System.out.print(decimal + " is an invalid input");
        } else {
            System.out.print("The Hex value is " + Integer.toHexString(decimal).toUpperCase());
        }
    }
}
