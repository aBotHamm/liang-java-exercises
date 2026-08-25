package chapter03;

import java.util.Scanner;

public class Exercise03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();

        double pricePerPoundItem1 = p1 / w1;
        double pricePerPoundItem2 = p2 / w2;

        if (pricePerPoundItem1 < pricePerPoundItem2)
            System.out.print("Package 1 has the better price");
        else if (pricePerPoundItem1 > pricePerPoundItem2)
            System.out.print("Package 2 has the better price");
        else
            System.out.print("Both packages have the same price");
    }
}
