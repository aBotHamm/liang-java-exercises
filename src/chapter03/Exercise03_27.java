package chapter03;

import java.util.Scanner;

public class Exercise03_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user for input
        System.out.print("Enter a point's x- and y-coordinate: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        if (x1 >= 0 && y1 >= 0 && y1 <= -0.5 * x1 + 100) {
            System.out.println("The coordinate is inside the triangle");
        } else {
            System.out.println("The coordinate is not inside the triangle");
        }
    }
}