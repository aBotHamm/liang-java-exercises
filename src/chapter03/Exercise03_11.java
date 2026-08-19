package chapter03;

import java.util.Scanner;

public class Exercise03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month as a digit: ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // REMOVED 4, 6, 9, and 11 from this check
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (month == 1)
                System.out.println("January " + year + " has 31 days");
            else if (month == 3) {
                System.out.println("March " + year + " has 31 days");
            } else if (month == 5) {
                System.out.println("May " + year + " has 31 days");
            } else if (month == 7) {
                System.out.println("July " + year + " has 31 days");
            } else if (month == 8) {
                System.out.println("August " + year + " has 31 days");
            } else if (month == 10) {
                System.out.println("October " + year + " has 31 days");
            } else if (month == 12) {
                System.out.println("December " + year + " has 31 days");
            }
        } else if (month == 4) {
            System.out.println("April " + year + " has 30 days");
        } else if (month == 6) {
            System.out.println("June " + year + " has 30 days");
        } else if (month == 9) {
            System.out.println("September " + year + " has 30 days");
        } else if (month == 11) {
            System.out.println("November " + year + " has 30 days");
        } else if (month == 2 && (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("February " + year + " is a leap year and has 29 days");
        } else if (month == 2) {
            System.out.println("February " + year + " has 28 days");
        } else {
            System.out.println("Please enter a valid month");
        }
    }
}
