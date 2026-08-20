package chapter03;

import java.util.Scanner;

public class Exercise03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();

        if (weight <= 0) {
            System.out.println("Invalid input");
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped");
        } else if (weight <= 1) {
            System.out.println("Shipping cost is $3.50");
        } else if (weight <= 3) {
            System.out.println("Shipping cost is $5.50");
        } else if (weight <= 10) {
            System.out.println("Shipping cost is $8.50");
        } else { // weight <= 20
            System.out.println("Shipping cost is $10.50");
        }
        
        input.close();
    }
}
