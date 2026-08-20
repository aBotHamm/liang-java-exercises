package chapter03;

import java.util.Scanner;

public class Exercise03_15 {
    public static void main(String[] args) {
        // Generate a 3-digit lottery number
        int digit1 = (int) (Math.random() * 10);
        int digit2 = (int) (Math.random() * 10);
        int digit3 = (int) (Math.random() * 10);
        int lottery = digit1 * 100 + digit2 * 10 + digit3;

        // Prompt user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        // Extract digits from guess
        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess % 100) / 10;
        int guessDigit3 = guess % 10;

        // Show the lottery number
        System.out.println("The lottery number is " + lottery);

        // Check conditions
        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if ((guessDigit1 == digit1 && guessDigit2 == digit3 && guessDigit3 == digit2) ||
                (guessDigit1 == digit2 && guessDigit2 == digit1 && guessDigit3 == digit3) ||
                (guessDigit1 == digit2 && guessDigit2 == digit3 && guessDigit3 == digit1) ||
                (guessDigit1 == digit3 && guessDigit2 == digit1 && guessDigit3 == digit2) ||
                (guessDigit1 == digit3 && guessDigit2 == digit2 && guessDigit3 == digit1)) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == digit1 || guessDigit1 == digit2 || guessDigit1 == digit3 ||
                guessDigit2 == digit1 || guessDigit2 == digit2 || guessDigit2 == digit3 ||
                guessDigit3 == digit1 || guessDigit3 == digit2 || guessDigit3 == digit3) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }

        input.close();
    }
}