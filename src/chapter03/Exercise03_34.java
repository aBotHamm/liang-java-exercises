package chapter03;

import java.util.Scanner;

public class Exercise03_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double crossProduct = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        boolean isCollinear = Math.abs(crossProduct) < 1e-7;
        boolean withinXRange = x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1);
        boolean withinYRange = y2 >= Math.min(y0, y1) && y2 <= Math.max(y0, y1);

        if (isCollinear && withinXRange && withinYRange) {
            System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)%n",
                    x2, y2, x0, y0, x1, y1);
        } else {
            System.out.printf("(%.1f, %.1f) is not on the line segment from (%.1f, %.1f) to (%.1f, %.1f)%n",
                    x2, y2, x0, y0, x1, y1);
        }
    }
}