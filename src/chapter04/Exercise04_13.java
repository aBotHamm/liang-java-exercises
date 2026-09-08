package chapter04;

import java.util.Scanner;

public class Exercise04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.print(letter + " is a vowel");
        } else if (letter >= 65 && letter <= 90 || letter >= 97 && letter <= 122) {
            System.out.println(letter + " is a consonant");
        } else
            System.out.println(letter + " is an invalid input");
    }
}
