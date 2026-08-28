package chapter04;

import java.util.Scanner;

public class Exercise04_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a length from the center to a vertex: ");
        double length = input.nextDouble();

        double s = 2 * length * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %.2f%n", area);
    }
}
