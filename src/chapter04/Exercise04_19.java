package chapter04;

import java.util.Scanner;

public class Exercise04_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first nine digits of an ISBN as integers: ");
        String ISBN = scanner.next();

        int d1 = ISBN.charAt(0) - '0';
        int d2 = ISBN.charAt(1) - '0';
        int d3 = ISBN.charAt(2) - '0';
        int d4 = ISBN.charAt(3) - '0';
        int d5 = ISBN.charAt(4) - '0';
        int d6 = ISBN.charAt(5) - '0';
        int d7 = ISBN.charAt(6) - '0';
        int d8 = ISBN.charAt(7) - '0';
        int d9 = ISBN.charAt(8) - '0';

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (d10 == 10) {
            System.out.println("The ISBN number is " + ISBN + "X");
        } else {
            System.out.println("The ISBN number is " + ISBN + d10);
        }
    }
}