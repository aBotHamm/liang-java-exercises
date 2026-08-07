package chapter02;

import java.util.Scanner;

public class Exercise02_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numOfMinutes, totalYears, totalDays;

        System.out.print("Enter the number of minutes: ");
        numOfMinutes = input.nextInt();

        int minInYear = 60 * 24 * 365;
        int minInDay = 60 * 24;

        totalYears =  numOfMinutes / minInYear;
        totalDays = (numOfMinutes % minInYear) / minInDay;

        System.out.println(numOfMinutes + " minutes is approximately " + totalYears + " years and " + totalDays + " days");
    }
}