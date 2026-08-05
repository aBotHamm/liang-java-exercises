package chapter02;

import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gratuity, subtotal, total;

        System.out.print("Enter the subtotal: ");
        subtotal = input.nextDouble();
        System.out.print("Enter the gratuity: ");
        gratuity = input.nextDouble();

        total = (gratuity/100) * subtotal;

        System.out.println("The gratuity is $" + ((gratuity/100) * subtotal) + " and the total is $" + (subtotal + total));


    }
}
