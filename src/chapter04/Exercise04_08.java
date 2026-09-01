package chapter04;

import java.util.Scanner;

public class Exercise04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ASII code (0-127): ");
        int asciiCode = input.nextInt();

        char asciiToLetter = (char) asciiCode;

        System.out.print(asciiToLetter);
    }
}
