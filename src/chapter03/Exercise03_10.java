package chapter03;

import java.util.Scanner;

public class Exercise03_10 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 99);
        int number2 = (int) (Math.random() * 99);

        // if number1 < number2, swap number1 with number 2
//        if (number1 < number2) {
//            int temp = number1;
//            number1 = number2;
//            number2 = temp;
//        }

        System.out.println("What is " + number1 + " + " + number2 + "? ");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 + number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong!");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }
    }
}
