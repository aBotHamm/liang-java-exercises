package chapter03;

import java.util.Scanner;

public class Exercise03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coin = (int) (Math.random() * 2);

        System.out.print("Enter 0 for heads or 1 for tails: ");
        int guess = input.nextInt();

        if (coin == 0) {
            System.out.println("Coin landed on heads");
        } else {
            System.out.println("Coin landed on tails");
        }

        if (guess == coin) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
        input.close();
    }
}