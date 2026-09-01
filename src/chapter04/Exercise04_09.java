package chapter04;

import java.util.Scanner;

public class Exercise04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        int asciiCode = (int) character;
        System.out.print("The ASCII code is " + asciiCode);
    }
}
