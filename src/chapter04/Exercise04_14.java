package chapter04;

import java.util.Scanner;

public class Exercise04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char grade = input.next().charAt(0);

        if (grade == 'a' || grade == 'A' || grade == 'b' || grade == 'B' || grade == 'c' || grade == 'C' || grade == 'd' || grade == 'D' || grade == 'f' || grade == 'F') {
            if (grade == 'a' || grade == 'A')
                System.out.print("The numeric value for grade " + grade + " is 4");
            else if (grade == 'b' || grade == 'B') {
                System.out.print("The numeric value for grade " + grade + " is 3");
            } else if (grade == 'c' || grade == 'C') {
                System.out.print("The numeric value for grade " + grade + " is 2");
            } else if (grade == 'd' || grade == 'D') {
                System.out.print("The numeric value for grade " + grade + " is 1");
            } else if (grade == 'f' || grade == 'F') {
                System.out.print("The numeric value for grade " + grade + " is 0");
            }
        } else
            System.out.print(grade + " is an invalid grade");

    }
}
