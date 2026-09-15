package chapter05;

import java.util.Scanner;

public class Exercise05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String studentName, bestName = "";
        double bestScore = 0;
        int studentScore;

        System.out.print("Enter the number of students: ");
        int studentCount = input.nextInt();


        for (int i = 1; i <= studentCount; i++) {
            System.out.print("Enter a student name: ");
            studentName = input.next();

            System.out.print("Enter a student score: ");
            studentScore = input.nextInt();

            if (studentScore > bestScore) {
                bestScore = studentScore;
                bestName = studentName;
            }
        }
        System.out.println("Top student " + bestName + "'s score is " + bestScore);
    }
}
