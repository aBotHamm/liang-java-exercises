package chapter04;

import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter the month: ");
        String month = input.next();

        int numOfDays;

        switch (month) {
            case "Jan":
                numOfDays = 31;
                break;
            case "Feb":
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    numOfDays = 29;
                } else {
                    numOfDays = 28;
                }
                break;
            case "Mar":
                numOfDays = 31;
                break;
            case "Apr":
                numOfDays = 30;
                break;
            case "May":
                numOfDays = 31;
                break;
            case "Jun":
                numOfDays = 30;
                break;
            case "Jul":
                numOfDays = 31;
                break;
            case "Aug":
                numOfDays = 31;
                break;
            case "Sep":
                numOfDays = 30;
                break;
            case "Oct":
                numOfDays = 31;
                break;
            case "Nov":
                numOfDays = 30;
                break;
            case "Dec":
                numOfDays = 31;
                break;
            default:
                System.out.print(month + " is not a correct month name");
                return;
        }
        System.out.print(month + " " + year + " has " + numOfDays + " days");
    }
}