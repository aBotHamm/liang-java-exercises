package chapter03;

import java.util.Scanner;

public class Exercise03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter one of the following:\n(0) Rock\n(1) Paper\n(2) Scissors");
        int userChoice = input.nextInt();

        int computerChoice = (int) (Math.random() * 3);

        // print user choice
        if (userChoice == 0) {
            System.out.println("You chose Rock");
        } else if (userChoice == 1) {
            System.out.println("You chose Paper");
        } else if (userChoice == 2) {
            System.out.println("You chose Scissors");
        }

        // print computer choice
        if (computerChoice == 0) {
            System.out.println("Computer chose Rock");
        } else if (computerChoice == 1) {
            System.out.println("Computer chose Paper");
        } else if (computerChoice == 2) {
            System.out.println("Computer chose Scissors");
        }

        // calculate and display results
        if (userChoice == computerChoice) {
            System.out.println("It is a draw");
        } else if (userChoice == 0 && computerChoice == 2) {
            System.out.println("You won");
        } else if (userChoice == 0 && computerChoice == 1) {
            System.out.println("You lost");
        } else if (userChoice == 1 && computerChoice == 2) {
            System.out.println("You lost");
        } else if (userChoice == 1 && computerChoice == 0) {
            System.out.println("You won");
        } else if (userChoice == 2 && computerChoice == 1) {
            System.out.println("You won");
        } else if (userChoice == 2 && computerChoice == 0) {
            System.out.println("You lost");
        } else
            System.out.println("Enter valid input");

    }
}