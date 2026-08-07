package chapter02;

import java.util.Scanner;

public class Exercise02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput;

        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds/1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds /60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;


        System.out.print("Enter the timezone offset to GMT: ");
        userInput = input.nextInt();
        System.out.println("Current time is " + (long)(currentHour + userInput) + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
