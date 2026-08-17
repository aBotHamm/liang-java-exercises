package chapter03;

import java.util.Scanner;

public class Exercise03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // Swap num1 and num2 if num1 is larger
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Swap num2 and num3 if num2 is larger
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Check num1 and num2 one more time in case the new num2 is smaller than num1
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Numbers in non-descending order: " + num1 + " " + num2 + " " + num3);

        input.close();
    }
}
