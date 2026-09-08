package chapter04;

import java.util.Scanner;

public class Exercise04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an string of words: ");
        String text = input.nextLine();


        System.out.print("Length: " + text.length() + "\n" + "First character is \"" + text.substring(0, 1) + "\"");

    }
}
