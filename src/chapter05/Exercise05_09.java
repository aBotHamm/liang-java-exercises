package chapter05;

import java.util.Scanner;

public class Exercise05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String studentName, bestName = "", secondBestName = "";
        double bestScore = 0, secondBestScore = 0;
        int studentScore;

        System.out.print("Enter the number of students: ");
        int studentCount = input.nextInt();


        for (int i = 1; i <= studentCount; i++) {
            System.out.print("Enter a student name: ");
            studentName = input.next();

            System.out.print("Enter a student score: ");
            studentScore = input.nextInt();

            if (studentScore > bestScore) {
                secondBestScore = bestScore;
                secondBestName = bestName;
                bestScore = studentScore;
                bestName = studentName;
            } else if (studentScore > secondBestScore) {
                secondBestScore = studentScore;
                secondBestName = studentName;
            }
        }
        System.out.println("Top student " + bestName + "'s score is " + bestScore);
        System.out.println("Second best student " + secondBestName + "'s score is " + secondBestScore);
    }
}
