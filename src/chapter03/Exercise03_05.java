package chapter03;

import java.util.Scanner;

public class Exercise03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user for input
        System.out.print("Enter today's day: ");
        int userDay = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int numOfDaysPassed = input.nextInt();

        String today = "";
        switch (userDay) {
            case 0:
                today = "Sunday";
                break;
            case 1:
                today = "Monday";
                break;
            case 2:
                today = "Tuesday";
                break;
            case 3:
                today = "Wednesday";
                break;
            case 4:
                today = "Thursday";
                break;
            case 5:
                today = "Friday";
                break;
            case 6:
                today = "Saturday";
                break;
            default:
                System.out.println("Enter valid day");
                System.exit(0);
        }

        String futureDayString = "";

        int futureDay = (userDay + numOfDaysPassed) % 7;

        switch (futureDay) {
            case 0:
                futureDayString = "Sunday";
                break;
            case 1:
                futureDayString = "Monday";
                break;
            case 2:
                futureDayString = "Tuesday";
                break;
            case 3:
                futureDayString = "Wednesday";
                break;
            case 4:
                futureDayString = "Thursday";
                break;
            case 5:
                futureDayString = "Friday";
                break;
            case 6:
                futureDayString = "Saturday";
                break;
        }

        System.out.println("Today is " + today + " and the future day is " + futureDayString);
    }
}
