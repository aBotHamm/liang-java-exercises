package chapter05;

public class Exercise05_05 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-15s| %-10s%s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");
        for (int i = 1; i <= 200; i += 2) {
            int position = (i + 1) / 2;
            double pounds = 20 + 5 * (position - 1);
            double rightKg = pounds / 2.2;
            System.out.printf("%-10d%-15.2f| %-10d%.2f%n", i, i * 2.2, (int) pounds, rightKg);
        }
    }
}