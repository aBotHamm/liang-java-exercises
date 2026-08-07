package chapter02;

import java.util.Scanner;

public class Exercise02_11 {
    public static void main(String[] args) {
        double start = 312032486;

        Scanner input = new Scanner(System.in);
        int year;
        // 1 birth every 7 seconds
        // 1 death every 13 seconds
        // 1 new immigrant every 45 seconds

        //calculate how many seconds in a year

        double secondsInOneYear = 60 * 60 * 24 * 365;
        double birthsPerYear = secondsInOneYear / 7.0;
        double deathsPerYear = secondsInOneYear / 13.0;
        double immigrantsPerYear = secondsInOneYear / 45.0;

        /*
        System.out.println(birthsPerYear);
        System.out.println(deathsPerYear);
        System.out.println(immigrantsPerYear);
         */
        System.out.print("Enter the number of years: ");
        year = input.nextInt();
        for (int i = 0; i < year ; i++) {
            start += birthsPerYear - deathsPerYear + immigrantsPerYear;
            System.out.println("Population = " + (long) start);
            //output
        }

    }
}
