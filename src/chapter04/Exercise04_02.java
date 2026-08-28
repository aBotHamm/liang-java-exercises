package chapter04;

import java.util.Scanner;

public class Exercise04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x1ToRadians = Math.toRadians(x1);
        double y1ToRadians = Math.toRadians(y1);
        double x2ToRadians = Math.toRadians(x2);
        double y2ToRadians = Math.toRadians(y2);

        double d = 6371.01 * Math.acos(Math.sin(x1ToRadians) * Math.sin(x2ToRadians) + Math.cos(x1ToRadians) * Math.cos(x2ToRadians) * Math.cos(y1ToRadians - y2ToRadians));

        System.out.print("The distance between the two points is " + d + " km");
    }
}
