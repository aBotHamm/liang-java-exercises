package chapter03;

import java.util.Scanner;

public class Exercise03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        long userNum = input.nextLong();
        long initialUserNum = userNum;

        // extracting from right to left
        int d3 = (int) (userNum % 10);
        userNum /= 10;

        int d2 = (int) (userNum % 10);
        userNum /= 10;

        int d1 = (int) (userNum % 10);

        if (d1 == d3)
            System.out.println(initialUserNum + " is a palindrome");
        else
            System.out.println(initialUserNum + " is not a palindrome");

    }
}
