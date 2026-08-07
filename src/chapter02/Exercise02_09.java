package chapter02;

import java.util.Scanner;

public class Exercise02_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double v0, v1, time, acceleration;

        System.out.print("Enter v0, v1 and time: ");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        time = input.nextDouble();

        acceleration = (v1-v0)/time;

        System.out.println("The average acceleration is " + acceleration);
    }
}
