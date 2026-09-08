package chapter04;

import java.util.Scanner;

public class Exercise04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        char ch1 = input.next().charAt(0);
        char ch2 = input.next().charAt(0);

        if (ch1 == 'M' || ch1 == 'm') {
            if (ch2 == 1)
                System.out.print("Mathematics Freshman");
            else if (ch2 == 2) {
                System.out.print("Mathematics Sophomore");
            } else if (ch2 == 3) {
                System.out.print("Mathematics Junior");
            } else
                System.out.print("Mathematics Senior");

        } else if (ch1 == 'C' || ch1 == 'c') {
            if (ch2 == 1)
                System.out.print("Computer Science Freshman");
            else if (ch2 == 2) {
                System.out.print("Computer Science Sophomore");
            } else if (ch2 == 3) {
                System.out.print("Computer Science Junior");
            } else
                System.out.print("Computer Science Senior");

        } else if (ch1 == 'I' || ch1 == 'i') {
            if (ch2 == 1)
                System.out.print("Information Technology Freshman");
            else if (ch2 == 2) {
                System.out.print("Information Technology Sophomore");
            } else if (ch2 == 3) {
                System.out.print("Information Technology Junior");
            } else
                System.out.print("Information Technology Senior");
        } else
            System.out.print("Invalid input");


    }
}
