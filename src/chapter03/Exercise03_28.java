package chapter03;

import java.util.Scanner;

public class Exercise03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        double r1LeftEdge = x1 - w1 / 2;
        double r1RightEdge = x1 + w1 / 2;
        double r1BottomEdge = y1 - h1 / 2;
        double r1TopEdge = y1 + h1 / 2;

        double r2LeftEdge = x2 - w2 / 2;
        double r2RightEdge = x2 + w2 / 2;
        double r2BottomEdge = y2 - h2 / 2;
        double r2TopEdge = y2 + h2 / 2;

        if (r2LeftEdge >= r1LeftEdge && r2RightEdge <= r1RightEdge &&
                r2BottomEdge >= r1BottomEdge && r2TopEdge <= r1TopEdge) {
            System.out.println("R2 is inside R1");
        } else if (r1LeftEdge <= r2RightEdge && r1RightEdge >= r2LeftEdge &&
                r1BottomEdge <= r2TopEdge && r1TopEdge >= r2BottomEdge) {
            System.out.println("R1 overlaps R2");
        } else {
            System.out.println("R1 does not overlap R2");
        }
    }
}
