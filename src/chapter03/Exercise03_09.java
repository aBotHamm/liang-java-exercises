package chapter03;

import java.util.Scanner;

public class Exercise03_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first nine digits of an ISBN as integers: ");
        long ISBN = scanner.nextLong();
        long initialISBN = ISBN;

        // extracting from right to left
        int d9 = (int) (ISBN % 10);
        ISBN /= 10;

        int d8 = (int) (ISBN % 10);
        ISBN /= 10;

        int d7 = (int) (ISBN % 10);
        ISBN /= 10;

        int d6 = (int) (ISBN % 10);
        ISBN /= 10;

        int d5 = (int) (ISBN % 10);
        ISBN /= 10;

        int d4 = (int) (ISBN % 10);
        ISBN /= 10;

        int d3 = (int) (ISBN % 10);
        ISBN /= 10;

        int d2 = (int) (ISBN % 10);
        ISBN /= 10;

        int d1 = (int) (ISBN % 10);


        // generating 10th digit

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (d10 == 10) {
            System.out.printf("The ISBN number is %09dX\n", initialISBN);
        } else
            System.out.printf("The ISBN number is %09d%d\n", initialISBN, d10);
    }
}
