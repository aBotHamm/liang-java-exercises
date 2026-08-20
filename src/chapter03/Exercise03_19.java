package chapter03;

import java.util.Scanner;

public class Exercise03_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the edges: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if (((edge1 + edge2) > edge3) && ((edge1 + edge3) > edge2) && ((edge2 + edge3) > edge1)) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("Perimeter = " + perimeter);
        } else
            System.out.println("Input is invalid");

        input.close();
    }
}
