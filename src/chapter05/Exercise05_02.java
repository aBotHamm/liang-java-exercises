package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise05_02 {
    public static void main(String[] args) {
        final int NUM_OF_QUESTIONS = 10;

        Random random = new Random();

        int correctCount = 0;
        int counter = 0;

        long startTime = System.currentTimeMillis();
        String output = "";

        Scanner input = new Scanner(System.in);

        while (counter < NUM_OF_QUESTIONS) {
            int number1 = random.nextInt(1, 16);
            int number2 = random.nextInt(1, 16);

            System.out.print("\nWhat is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.print("You are correct!\n");
                correctCount++;
            } else {
                System.out.print("Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2) + "\n");
            }

            counter++;

            output += "\n" + number1 + " + " + number2 + " = " + answer + (((number1 + number2) == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.print("\nCorrect count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);

    }
}
