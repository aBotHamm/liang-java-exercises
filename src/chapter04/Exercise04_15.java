package chapter04;

import java.util.Scanner;

public class Exercise04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        if (letter >= 'a' && letter <= 'c' || letter >= 'A' && letter <= 'C') {
            System.out.print("The corresponding number is 2");
        } else if (letter >= 'd' && letter <= 'f' || letter >= 'D' && letter <= 'F') {
            System.out.print("The corresponding number is 3");
        } else if (letter >= 'g' && letter <= 'i' || letter >= 'G' && letter <= 'I') {
            System.out.print("The corresponding number is 4");
        } else if (letter >= 'j' && letter <= 'l' || letter >= 'J' && letter <= 'L') {
            System.out.print("The corresponding number is 5");
        } else if (letter >= 'm' && letter <= 'o' || letter >= 'M' && letter <= 'O') {
            System.out.print("The corresponding number is 6");
        } else if (letter >= 'p' && letter <= 's' || letter >= 'P' && letter <= 'S') {
            System.out.print("The corresponding number is 7");
        } else if (letter >= 't' && letter <= 'v' || letter >= 'T' && letter <= 'V') {
            System.out.print("The corresponding number is 8");
        } else if (letter >= 'w' && letter <= 'z' || letter >= 'W' && letter <= 'Z') {
            System.out.print("The corresponding number is 9");
        } else
            System.out.print(letter + " is an invalid input ");
    }
}
