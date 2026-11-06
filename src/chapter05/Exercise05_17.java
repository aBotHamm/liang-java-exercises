import java.util.Scanner;

public class Exercise05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.printf("%4s", "");
            }

            for (int j = i; j >= 1; j--) {
                System.out.printf("%4d", j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.printf("%4d", j);
            }
            System.out.println();
        }
    }
}