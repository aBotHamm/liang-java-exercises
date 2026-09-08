package chapter04;

import java.util.Scanner;

public class Exercise04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex character: ");
        String number = input.next();

        char digitChar = number.charAt(0);
        if (digitChar >= '0' && digitChar <= '9' || digitChar >= 'A' && digitChar <= 'F' || digitChar >= 'a' && digitChar <= 'f') {
            Integer digit = Integer.parseInt(number, 16);
            String hexDigit = Integer.toBinaryString(digit);
            System.out.print(hexDigit);
        } else
            System.out.println(number + " is an invalid input");
    }
}
