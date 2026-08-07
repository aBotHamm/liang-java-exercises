package chapter02;

import java.util.Scanner;

public class Exercise02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double speed, acceleration, lengthNeeded;

        System.out.print("Enter speed and acceleration: ");
        speed = input.nextDouble();
        acceleration = input.nextDouble();

        lengthNeeded = (speed*speed)/(2*acceleration);

        System.out.println("The minimum runaway length for this airplane is " + lengthNeeded);

    }
}
