package chapter03;

import java.util.Scanner;

public class Exercise03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.print("Enter the timezone offset to GMT: ");
        int userInput = input.nextInt();

        // normalize into 0-23 range, handling negative offsets too
        int time = (int) ((currentHour + userInput) % 24 + 24) % 24;

        String amPm;
        int displayHour;

        if (time == 0) {
            displayHour = 12;
            amPm = "AM";
        } else if (time < 12) {
            displayHour = time;
            amPm = "AM";
        } else if (time == 12) {
            displayHour = 12;
            amPm = "PM";
        } else {
            displayHour = time - 12;
            amPm = "PM";
        }

        System.out.printf("Current time is %d:%02d:%02d %s%n", displayHour, currentMinute, currentSecond, amPm);
    }
}