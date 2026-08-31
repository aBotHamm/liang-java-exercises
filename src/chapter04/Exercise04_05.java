package chapter04;

import java.util.Scanner;

public class Exercise04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();

        System.out.print("Enter the side length: ");
        double length = input.nextDouble();

        double area = ((sides * length * length) / (4 * Math.tan(Math.PI / sides)));

        System.out.printf("The area of the polygon is %.2f%n", area);
    }
}
